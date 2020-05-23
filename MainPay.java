import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class MainPay extends Container{
    private JButton main;
    private JLabel operatorLabel;
    private String[] operator = {"Beeline","Activ","Tele2","Altel"};
    private JComboBox operatorBox;

    private JTextField text;
    private JLabel number;
    private JLabel summ;
    private JTextField summa;
    private JButton do_it;

    public MainPay(){
        setSize(400,500);
        setLayout(null);

        JLabel bank = new JLabel("GGG Bank");
        bank.setBounds(160,80,80,20);
        add(bank);

        operatorLabel = new JLabel("Оператор: ");
        operatorLabel.setBounds(60,160,80,30);
        add(operatorLabel);

        operatorBox = new JComboBox(operator);
        operatorBox.setBounds(140,160,200,30);
        add(operatorBox);

        number = new JLabel("Номер: ");
        number.setBounds(60,200,50,30);
        add(number);

        text = new JTextField();
        text.setBounds(140,200,200,30);
        add(text);

        summ = new JLabel("Сумма: ");
        summ.setBounds(60,240,50,30);
        add(summ);

        summa = new JTextField();
        summa.setBounds(140,240,200,30);
        add(summa);

        do_it = new JButton("Выполнить");
        do_it.setBounds(120,350,160,30);
        do_it.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String operator = (String) operatorBox.getSelectedItem();
                String number = text.getText();
                String sum = summa.getText();

                UserOrder userOrder = new UserOrder(operator,number,sum);
                Main.addUserOrders(userOrder);

                String info = text.getText();
                String inf = summa.getText();
                if(!text.equals("") && summa.equals("")){
                    text.setText("Insert data");
                    summa.setText("Insert data");
                }
                else
                MainFrame.mainPayDoneSucces.setVisible(true);
                MainFrame.mainPay.setVisible(false);

                text.setText("");
                summa.setText("");
            }
        });
        add(do_it);

        main = new JButton("Главное меню");
        main.setBounds(100,400,200,30);
        main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MainFrame.mainMenu.setVisible(true);
                MainFrame.mainPay.setVisible(false);
            }
        });
        add(main);
    }

}
