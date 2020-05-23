import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private User user;
    private ArrayList<User> users;

    public PackageData(ArrayList<User> users){
        this.operationType = operationType;
        this.user = user;
        this.users = users;
    }

    public PackageData(String operationType, User user) {/// List all info from server
        this.operationType = operationType;
    }

    public PackageData(String list) {/// Send back to client
        this.users = users;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}