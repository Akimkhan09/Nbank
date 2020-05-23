import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MainTakeOther extends Container {
    private JTextField area;
    private JButton do_it;
    private JButton main;

    public MainTakeOther(){
        setSize(400,500);
        setLayout(null);

        area = new JTextField();
        area.setBounds(40,40,310,100);
        add(area);

        do_it = new JButton("Выполнить");
        do_it.setBounds(120,350,160,30);
        do_it.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = area.getText();
                if(area.equals("")){
                    area.setText("Insert data");
                }
                String money = area.getText();
                UserTakeMoney userTakeMoney = new UserTakeMoney(money);
                Main.addUserTakeMoney(userTakeMoney);

                MainFrame.mainTakeDone.setVisible(true);
                MainFrame.mainTakeOther.setVisible(false);

                area.setText("");
            }
        });
        add(do_it);

        main = new JButton("Главное меню");
        main.setBounds(100,400,200,30);
        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(true);
                MainFrame.mainTakeOther.setVisible(false);
            }
        });
        add(main);
    }
}