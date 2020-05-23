import javafx.scene.Parent;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainFrame extends JFrame{
    public static MainPage mainPage;
    public static MainMenu mainMenu;
    public static MainBalance mainBalance;
    public static MainUserList mainUserList;
    public static MainTake mainTake;
    public static MainTakeDone mainTakeDone;
    public static MainTakeOther mainTakeOther;
    public static MainPay mainPay;
    public static MainPayDoneSucces mainPayDoneSucces;
    public static UserRegistr userRegistr;

    public MainFrame(){
        setSize(400,500);
        setLayout(null);
        setTitle("GGG Bank");
        setLocation(150,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPage = new MainPage();
        mainPage.setLocation(0,0);
        add(mainPage);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0,0);
        mainMenu.setVisible(false);
        add(mainMenu);

        mainBalance = new MainBalance();
        mainBalance.setLocation(0,0);
        mainBalance.setVisible(false);
        add(mainBalance);

        mainUserList = new MainUserList();
        mainUserList.setLocation(0,0);
        mainUserList.setVisible(false);
        add(mainUserList);

        mainTake = new MainTake();
        mainTake.setLocation(0,0);
        mainTake.setVisible(false);
        add(mainTake);

        mainTakeDone = new MainTakeDone();
        mainTakeDone.setLocation(0,0);
        mainTakeDone.setVisible(false);
        add(mainTakeDone);

        mainTakeOther = new MainTakeOther();
        mainTakeOther.setLocation(0,0);
        mainTakeOther.setVisible(false);
        add(mainTakeOther);

        mainPay = new MainPay();
        mainPay.setLocation(0,0);
        mainPay.setVisible(false);
        add(mainPay);

        mainPayDoneSucces = new MainPayDoneSucces();
        mainPayDoneSucces.setLocation(0,0);
        mainPayDoneSucces.setVisible(false);
        add(mainPayDoneSucces);

        userRegistr = new UserRegistr();
        userRegistr.setLocation(0,0);
        userRegistr.setVisible(false);
        add(userRegistr);
    }
}
