import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MainTake extends Container{

    private JTextField count;
    private JButton take1;
    private JButton take2;
    private JButton take3;
    private JButton take4;
    private JButton take5;
    private JButton take6;
    private JButton take7;
    private JButton take8;
    private JButton do_it;
    private JButton main;

    public MainTake(){
        setSize(400,500);
        setLayout(null);

        count = new JTextField();
        count.setBounds(40,40,310,100);
        add(count);

        take1 = new JButton("50 000");
        take1.setBounds(40,180,150,30);
        add(take1);

        take1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take1.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take2 = new JButton("20 000");
        take2.setBounds(40,220,150,30);
        add(take2);
        take2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take2.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take3 = new JButton("5 000");
        take3.setBounds(40,260,150,30);
        add(take3);
        take3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take3.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take4 = new JButton("1 000");
        take4.setBounds(40,300,150,30);
        add(take4);
        take4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take4.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take5 = new JButton("30 000");
        take5.setBounds(200,180,150,30);
        add(take5);
        take5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take5.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take6 = new JButton("10 000");
        take6.setBounds(200,220,150,30);
        add(take6);
        take6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take6.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take7 = new JButton("2 000");
        take7.setBounds(200,260,150,30);
        add(take7);
        take7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = take7.getText();
                count.setText(text);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        take8 = new JButton("Другая сумма");
        take8.setBounds(200,300,150,30);
        add(take8);
        take8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainTake.setVisible(false);
                MainFrame.mainTakeOther.setVisible(true);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        do_it = new JButton("Выполнить");
        do_it.setBounds(120,350,160,30);
        do_it.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = count.getText();
                if(count.equals("")){
                    count.setText("Insert data");
                }
                String money = count.getText();
                UserTakeMoney userTakeMoney = new UserTakeMoney(money);
                Main.addUserTakeMoney(userTakeMoney);

                count.setText("");
            }
        });
        do_it.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainTakeDone.setVisible(true);
                MainFrame.mainTake.setVisible(false);
            }
        });
        add(do_it);

        main = new JButton("Главное меню");
        main.setBounds(100,400,200,30);
        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(true);
                MainFrame.mainTake.setVisible(false);
            }
        });
        add(main);
    }
}
