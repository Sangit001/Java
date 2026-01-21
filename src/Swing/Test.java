package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

    public static void main(String[] args) {
        JFrame f = new JFrame("Practice Swing");

        // Creating Label
        JLabel nameBox = new JLabel("Name:");
        JLabel addressBox = new JLabel("Address:");
        nameBox.setBounds(20,30,100,10);
        addressBox.setBounds(20,60,100,10);
        f.add(nameBox);
        f.add(addressBox);

        // Creating text input box
        JTextField inputForName = new JTextField();
        JTextField inputForAddress = new JTextField();
        inputForName.setBounds(80,30,100,20);
        inputForAddress.setBounds(80,60,100,20);
        f.add(inputForName);
        f.add(inputForAddress);

        // Creating button

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(80,90,100,20);
        submitBtn.setBackground(Color.red);
        f.add(submitBtn);

        // Size of screen


        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.blue );


        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel notice = new JLabel("You are logged in");
                notice.setBounds(80, 120,150,30);
                f.add(notice);

                f.add(notice);
                f.revalidate();
                f.repaint();

            }
        });


    }

}
