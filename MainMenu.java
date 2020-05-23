import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MainMenu extends Container{

    private JLabel bank;
    private JButton balance;
    private JButton take;
    private JButton pay;
    private JButton list;
    private JButton exit;

    public MainMenu(){
        setSize(400,500);
        setLayout(null);

        bank = new JLabel("GGG Bank");
        bank.setBounds(160,80,80,20);
        add(bank);

        balance = new JButton("Узнать баланс");
        balance.setBounds(80,130,220,30);
        balance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.mainBalance.setVisible(true);
            }
        });
        add(balance);

        take = new JButton("Снять наличные");
        take.setBounds(80,180,220,30);
        take.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.mainTake.setVisible(true);
            }
        });
        add(take);

        pay = new JButton("Оплатить мобильную связь");
        pay.setBounds(80,230,220,30);
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.mainPay.setVisible(true);
            }
        });
        add(pay);

        list = new JButton("Данные");
        list.setBounds(80,280,220,30);
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.mainUserList.setVisible(true);
            }
        });
        add(list);

        exit = new JButton("Выйти");
        exit.setBounds(80,330,220,30);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(false);
                MainFrame.mainPage.setVisible(true);
            }
        });
        add(exit);
    }
}