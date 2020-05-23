import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            DBManager manager = new DBManager();
            manager.connect();

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            PackageData packageData = null;
            while ( (packageData=(PackageData)inputStream.readObject())!=null ){
                if(packageData.getOperationType().equals("ADD")){/// "ADD", Student
                    User userFromClient = packageData.getUser();
                    manager.addStudent(userFromClient);
                }
                else if(packageData.getOperationType().equals("LIST")){
                    ArrayList<User> infoForClient = manager.getAllStudents();
                    PackageData toClient = new PackageData(infoForClient);
                    outputStream.writeObject(toClient);

                }
            }

            inputStream.close();
            outputStream.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
