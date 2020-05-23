import com.mysql.cj.xdevapi.AddResult;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MainPayDoneSucces extends Container {

    private static JTextArea area;
    private JLabel label;
    private JButton buttonLIST;
    private JButton main;
    private static UserOrder userOrder;

    public MainPayDoneSucces(){
        setSize(400,500);
        setLayout(null);

        label = new JLabel("История:");
        label.setBounds(100,60,75,30);
        add(label);

        area = new JTextArea();
        area.setBounds(100,100,200,230);
        add(area);

        buttonLIST = new JButton("Информация");
        buttonLIST.setBounds(120,350,160,30);
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                for(int i=0;i<Main.countOrder;i++){
                    s+=Main.userOrders[i]+"\n";
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
                MainFrame.mainPayDoneSucces.setVisible(false);
            }
        });
        add(main);
    }

}
