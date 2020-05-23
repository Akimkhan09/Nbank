import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUserList extends Container {

    public static JTextArea text;
    private JLabel info;
    private JButton buttonLIST;
    private JButton main;

    public MainUserList(){
        setSize(400,500);
        setLayout(null);

        info = new JLabel("Данные:");
        info.setBounds(160,80,200,20);
        add(info);

        text = new JTextArea("");
        text.setBounds(70,100,250,200);
        add(text);

        buttonLIST = new JButton("Информация");
        buttonLIST.setBounds(120,350,160,30);
        buttonLIST.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                for(int i=0;i<Main.countUsers;i++){
                    s+=Main.users[i]+"\n";
                }
                text.setText(s);

                PackageData pd = new PackageData("LIST");
                Main.connect(pd);
            }
        });
        add(buttonLIST);

        main = new JButton("Главное меню");
        main.setBounds(100,400,200,30);
        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(true);
                MainFrame.mainUserList.setVisible(false);
            }
        });
        add(main);
    }
}
