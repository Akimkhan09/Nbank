
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/final?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStudent(User user){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO student (id, name, surname, gender, number,password,money) " +
                    "VALUES (NULL, ?, ?, ?, ?,?,?)"
            );
            statement.setString(1, user.getName());
            statement.setString(2, user.getSurname());
            statement.setString(3, user.getGender());
            statement.setString(4, user.getNumber());
            statement.setString(5, user.getPassword());
            statement.setString(6, user.getMoney());

            statement.executeUpdate();

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<User> getAllStudents(){
        ArrayList<User> userList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM student");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String gender = resultSet.getString("gender");
                String number = resultSet.getString("number");
                String password = resultSet.getString("password");
                String money = resultSet.getString("money");


                userList.add(new User(id, name, surname, gender, number,password,money));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }
}
