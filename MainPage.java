import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.StyledEditorKit;

public class MainPage extends Container{

    private JLabel bank;
    private JTextField log_in;
    private JPasswordField password;
    private JButton login;
    private JButton registr;
    private static UserLogin userLogin;

    public MainPage(){
        setSize(400,500);
        setLayout(null);

        bank = new JLabel("GGG Bank");
        bank.setBounds(180,100,80,20);
        add(bank);

        log_in = new JTextField();
        log_in.setBounds(80,150,250,30);
        add(log_in);

        password = new JPasswordField();
        password.setBounds(80,200,250,30);
        add(password);

        login = new JButton("ВОЙТИ");
        login.setBounds(80,250,250,30);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UserLogin userLogin = new UserLogin();
                String log = log_in.getText();
                String pass = password.getText();
                if(log!=null && log.equals("") && pass!=null && pass.equals("")){
                    log_in.setText("");
                    password.setText("");
                    MainFrame.mainPage.setVisible(true);
                    MainFrame.mainMenu.setVisible(false);
                }
                else if(!log_in.getText().equals(userLogin.getNumber()) && !password.getText().equals(userLogin.getPassword())){
                    MainFrame.mainPage.setVisible(false);
                    MainFrame.mainMenu.setVisible(true);

                    log_in.setText("");
                    password.setText("");
                }
            }
        });
        add(login);
        repaint();


        registr = new JButton("РЕГИСТРАЦИЯ");
        registr.setBounds(80,300,250,30);
        registr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainPage.setVisible(false);
                MainFrame.userRegistr.setVisible(true);
                log_in.setText("");
                password.setText("");
            }
        });
        add(registr);
    }
}