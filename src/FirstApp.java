import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.awt.event.*;
public class FirstApp{
    public static void main(String[] arg) {

JFrame app = new JFrame("My first app");
JLabel Heading = new JLabel("This is my First app");
JButton button = new JButton("Click me");
        JPEGImageReadParam image = new JPEGImageReadParam();

button.setBounds (500,400,100,30);
Heading.setBounds(100,50,100,50);



button.addActionListener(new ActionListener() {
    boolean buttonClicked = false;
    public void actionPerformed(ActionEvent e) {

        if(!buttonClicked){

            Heading.setText("You clicked");
            button.setText("clicked");
             buttonClicked  = true;
        }else{
            button.setText("Error");
        }

    }
});


app.add(button);
app.add(Heading);

app.setSize(1920, 1080);
        app.setLayout(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}