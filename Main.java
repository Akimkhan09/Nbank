import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.*;
import javax.swing.JFrame;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;


public class Main {

    public static ObjectOutputStream outputStream;
    public static ObjectInputStream inputStream;
    public static Socket socket;

    public static User[] users = new User[40];
    public static int countUsers = 0;

    public static UserBalance[] userBalances = new UserBalance[40];
    public static int countUserBalances = 0;

    public static UserOrder[] userOrders = new UserOrder[40];
    public static int countOrder = 0;

    public static UserTakeMoney[] userTakeMonies = new UserTakeMoney[40];
    public static int countMoney = 0;

    public static UserLogin[] userLogins = new UserLogin[40];
    public static int countLogin = 0;


    public static void connect(PackageData pd){
        try{
            Socket socket = new Socket("127.0.0.1", 8888);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if(pd.getOperationType().equals("ADD")){
                outputStream.writeObject(pd);
            }
            else if(pd.getOperationType().equals("LIST")){
                outputStream.writeObject(pd);
                PackageData infoFromServer = (PackageData)inputStream.readObject();
                ArrayList<User> arrayListFromServer = infoFromServer.getUsers();
                String s = "";

                for(int i=0;i<arrayListFromServer.size();i++){
                    s+=arrayListFromServer.get(i)+"\n";
                }

                MainUserList.text.append(s);
            }
            inputStream.close();
            outputStream.close();
            socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
    public static void addUserOrders(UserOrder userOrder){
        userOrders[countOrder]= userOrder;
        countOrder++;
    }
    public static void addUserTakeMoney(UserTakeMoney userTakeMoney){
        userTakeMonies[countMoney] = userTakeMoney;
        countMoney++;
    }
    public static void addUsers(User user){
        users[countUsers] = user;
        countUsers++;
    }

    public static void addUserLogin(UserLogin userLogin){
        userLogins[countUsers] = userLogin;
        countUsers++;
    }
    public static void addUserBalances(UserBalance userBalance){
        userBalances[countUserBalances] = userBalance;
        countUserBalances++;
    }
}