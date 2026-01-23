package Swing;
import java.awt.*;
import javax.swing.*;
import java.util.*;

abstract class Detail{
    abstract void Username();
    abstract void Password();

    public class Person extends Detail{

        void Username(){
            String uName = "Sangit001";
        }
        void Password(){
            String uPassword = "Sangit9212@";
        }
    }
}


public class LoginPage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ask for username
//        String userInputUsername = sc.next();
//        String userInputPassword = sc.next();


        // Creating desktop GUI
        JFrame screen = new JFrame("Login");
        screen.setLayout(null);

        // Creating login title
        JLabel title = new JLabel("Login");
        title.setBounds(130,50,50,20);
        screen.add(title);

        // Creating input box
        //Text
        JLabel userText = new JLabel("Username: ");
        JLabel passText = new JLabel("Password: ");
        // Box
        JTextField userBox = new JTextField();
        JTextField passBox = new JTextField();

        // Labeling Box with text
        userText.setBounds(40, 100,100,20);
        userBox.setBounds(100, 100,150,20);
        passText.setBounds(40,140,100,20);
        passBox.setBounds(100, 140,150,20);

        // Creating button



        screen.setSize(300,600);
        screen.setVisible(true);
        screen.add(userText);
        screen.add(userBox);
        screen.add(passText);
        screen.add(passBox);



    }
}
