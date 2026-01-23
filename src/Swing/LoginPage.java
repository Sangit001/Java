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

        // Creating object using Person reference

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
        userBox.setBounds(110, 100,150,30);
        passText.setBounds(40,140,100,20);
        passBox.setBounds(110, 140,150,30);

        userBox.setBorder(null);
        passBox.setBorder(null);

        // Creating button

        JButton logBtn = new JButton("Login");
        logBtn.setBounds(100,180,100,30);


        // Login action


        if()





        screen.setSize(300,600);
        screen.setVisible(true);
        screen.add(userText);
        screen.add(userBox);
        screen.add(passText);
        screen.add(passBox);
        screen.add(logBtn);







    }
}
