import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserRegistr extends Container {
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel genderLabel;
    private JLabel numberLabel;
    private JLabel passwordLabel;
    private JLabel moneyLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private String[] gender = {"муж.", "жен."};
    private JComboBox genderBox;
    private String[] money = {"42 500","50 000","100 000","120 000"};
    private JComboBox moneyBox;
    private JTextField numberText;
    private JPasswordField passwordText;

    private JButton addButton;
    private JButton backButton;

    public UserRegistr(){
        setSize(400,500);
        setLayout(null);

        nameLabel = new JLabel("ИМЯ: ");
        nameLabel.setBounds(50, 60, 60, 30);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(150, 60, 150, 30);
        add(nameText);

        surnameLabel = new JLabel("ФАМИЛИЯ: ");
        surnameLabel.setBounds(50, 100, 100, 30);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(150, 100, 150, 30);
        add(surnameText);

        genderLabel = new JLabel("ПОЛ: ");
        genderLabel.setBounds(50, 140, 60, 30);
        add(genderLabel);

        genderBox = new JComboBox(gender);
        genderBox.setBounds(150, 140, 150, 30);
        add(genderBox);

        numberLabel = new JLabel("НОМЕР: ");
        numberLabel.setBounds(50, 180, 100, 30);
        add(numberLabel);

        numberText = new JTextField();
        numberText.setBounds(150, 180, 150, 30);
        add(numberText);

        passwordLabel = new JLabel("ПАРОЛЬ: ");
        passwordLabel.setBounds(50,220,100,30);
        add(passwordLabel);



        passwordText = new JPasswordField();
        passwordText.setBounds(150,220,150,30);
        add(passwordText);

        moneyLabel = new JLabel("ДЕНЬГИ: ");
        moneyLabel.setBounds(50,260,100,30);
        add(moneyLabel);

        moneyBox = new JComboBox(money);
        moneyBox.setBounds(150,260,150,30);
        add(moneyBox);

        addButton = new JButton("ДОБАВИТЬ");
        addButton.setBounds(50, 300, 250, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                String gender = (String)genderBox.getSelectedItem();
                String number = nameText.getText();
                String password = passwordText.getText();
                String money = (String)moneyBox.getSelectedItem();

                User user = new User(null, name, surname, gender, number,password,money);

                PackageData pd = new PackageData("ADD", user);
                Main.connect(pd);

                UserBalance userBalance = new UserBalance(money);
                UserLogin userLogin = new UserLogin(number,password);

                Main.addUsers(user);
                Main.addUserBalances(userBalance);
                Main.addUserLogin(userLogin);


                nameText.setText("");
                surnameText.setText("");
                numberText.setText("");
                passwordText.setText("");
            }
        });
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setBounds(50, 340, 250, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {MainFrame.mainMenu.setVisible(false);
                MainFrame.mainPage.setVisible(true);
                MainFrame.userRegistr.setVisible(false);
            }
        });
        add(backButton);


    }
}
