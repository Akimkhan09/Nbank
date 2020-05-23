import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MainBalance extends Container{

    private JLabel info;
    private static JTextArea area;
    private JButton main;
    private JButton buttonLIST;
    private static UserBalance userBalance;

    public MainBalance(){
        setSize(400,500);
        setLayout(null);

        info = new JLabel("История:");
        info.setBounds(108,80,200,20);
        add(info);

        area = new JTextArea("");
        area.setBounds(100,100,200,200);
        add(area);

        buttonLIST = new JButton("Информация");
        buttonLIST.setBounds(120,350,160,30);
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                for(int i=0;i<Main.countUserBalances;i++){
                    s+=Main.userBalances[i]+"\n";
                }
                area.setText(s);
            }
        });
        add(buttonLIST);

        main = new JButton("Главное меню");
        main.setBounds(100,400,200,30);
        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(true);
                MainFrame.mainBalance.setVisible(false);
            }
        });
        add(main);
    }
}