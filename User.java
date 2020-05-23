import java.util.ArrayList;

public class User extends ArrayList<User> {
    private Integer id;
    private String name;
    private String surname;
    private String gender;
    private String number;
    private String password;
    private String money;

    public User() {
    }

    public User(Integer id, String name, String surname, String gender, String number, String password, String money) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.number = number;
        this.password = password;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String telephone) {
        this.number = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Ф.И.О:   " + name+" "+ surname+ "\n"+
            "пол:        " + gender+ "\n"+
               "номер:   " + number+ "\n"+
               "пароль:  " + password+ "\n"+
              "денег:    " + money+".00 KZT";
    }
}
