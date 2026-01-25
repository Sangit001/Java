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
        name.setBounds(20,60,50,20);
        JTextField nameValue = new JTextField();
        nameValue.setBounds(80,60,150,20);

        // Age
        Integer[] ageOption = new Integer[50];
        for (int i = 0; i<50; i++) {
                ageOption[i] = i + 1;
            }
        JLabel age = new JLabel("Age:");
        age.setBounds(20,85,50,20);
        JComboBox<Integer> ageValue = new JComboBox<>(ageOption);
        ageValue.setBounds(80,85,150,20);
        frame.add(ageValue);

        // For gender

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(20,110,50,20);


        frame.add(gender);


        // Option for gender
        JRadioButton maleValue = new JRadioButton();
        maleValue.setBounds(80,110,25,20);
        frame.add(maleValue);
        JLabel male = new JLabel("Male");
        male.setBounds(105,110,50,20);
        frame.add(male);
        JRadioButton femaleValue = new JRadioButton();
        femaleValue.setBounds(145,110,25,20);
        frame.add(femaleValue);
        JLabel female = new JLabel("Female");
        female.setBounds(170,110,50,20);
        frame.add(female);


        // Label for hobbies

        JLabel hobbies = new JLabel("Hobbies:");
        hobbies.setBounds(20,135,100,20);
        frame.add(hobbies);

        // Checkbox for hobbies
        JCheckBox hobbies1 = new JCheckBox("Playing");
        hobbies1.setBounds(80, 135, 100,20);
        frame.add(hobbies1);
        JCheckBox hobbies2 = new JCheckBox("Singing");
        hobbies2.setBounds(180, 135, 100,20);
        frame.add(hobbies2);
        JCheckBox hobbies3 = new JCheckBox("Swim");
        hobbies3.setBounds(280, 135, 100,20);
        frame.add(hobbies3);

        // Country option







        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(title);
        frame.add(name);
        frame.add(nameValue);
        frame.add(age);




    }
}