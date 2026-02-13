package Swing;
import javax.swing.*;


public class StudentRegistration {
    public static void main(String[] args){

        // Creating frame/window

        JFrame frame = new JFrame("Student Registration");
        frame.setSize(500,500);

        // Title
        JLabel title = new JLabel("Student Details");
        title.setBounds(200,20,150,20);

        // Name
        JLabel name = new JLabel("Name:");
        name.setBounds(20,70,50,20);
        JTextField nameValue = new JTextField();
        nameValue.setBounds(80,70,150,20);

        // Age
        Integer[] ageOption = new Integer[50];
        for (int i = 0; i<50; i++) {
                ageOption[i] = i + 1;
            }
        JLabel age = new JLabel("Age:");
        age.setBounds(20,95,50,20);
        JComboBox<Integer> ageValue = new JComboBox<>(ageOption);
        ageValue.setBounds(80,95,150,20);
        frame.add(ageValue);

        // For gender

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(20,120,50,20);


        frame.add(gender);


        // Option for gender
        JRadioButton maleValue = new JRadioButton();
        maleValue.setBounds(80,120,25,20);
        frame.add(maleValue);
        JLabel male = new JLabel("Male");
        male.setBounds(105,120,50,20);
        frame.add(male);
        JRadioButton femaleValue = new JRadioButton();
        femaleValue.setBounds(145,120,25,20);
        frame.add(femaleValue);
        JLabel female = new JLabel("Female");
        female.setBounds(170,120,50,20);
        frame.add(female);


        // Label for hobbies

        JLabel hobbies = new JLabel("Hobbies:");
        hobbies.setBounds(20,145,100,20);
        frame.add(hobbies);

        // Checkbox for hobbies
        JCheckBox hobbies1 = new JCheckBox("Playing");
        hobbies1.setBounds(80, 145, 100,20);
        frame.add(hobbies1);
        JCheckBox hobbies2 = new JCheckBox("Singing");
        hobbies2.setBounds(180, 145, 100,20);
        frame.add(hobbies2);
        JCheckBox hobbies3 = new JCheckBox("Swim");
        hobbies3.setBounds(280, 145, 100,20);
        frame.add(hobbies3);

        // Country label
        JLabel country = new JLabel("Country:");
        country.setBounds(20,170,100,20);
        frame.add(country);

        // Option for Country
        String[] countryOption = {"Nepal","China","India","Pakistan","United States","United Kingdom","Brazil","Mexico",
        "Bangladesh"};
        JComboBox<String> countryValue = new JComboBox<>(countryOption);
        countryValue.setBounds(80,170,150,20);
        frame.add(countryValue);

        // Comments
        JLabel comments = new JLabel("Comment:");
        comments.setBounds(20,195,100,20);
        frame.add(comments);

        JTextArea commentBox = new JTextArea();
        commentBox.setBounds(90,195,150,50);
        frame.add(commentBox);

        // Creating buttons

        //Submit btn
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(80,270,75,30);
        frame.add(submitBtn);

        // Cancel btn
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(150,270,75,30);
        frame.add(cancelBtn);








        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(title);
        frame.add(name);
        frame.add(nameValue);
        frame.add(age);




    }
}