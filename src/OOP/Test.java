package OOP;
import java.util.*;


// =============================== Data hiding ===============================

//public class Test {
//    private int Serial; // Data hidden
//
//    public void setSerial(int s){  // setting and initializing data into s
//        Serial = s;
//    }
//    public int getSerial(){  // Method for returning value
//        return Serial;
//    }
//
//    public static void main(String[] args){
//
//        Test t = new Test();  // creating object of test class
//        t.setSerial(20);
//        System.out.println(t.getSerial());
//
//    }
//
//}

// Creating a program which takes input username and password using Data hiding
//
//public class Test{
//    private String Username;
//    private String Password;
//
//    public void setUsername(String username){
//        Username = username;
//
//
//    }    public void setPassword(String password){
//
//        Password = password;
//    }
//    public String getUsername(){
//        return Username;
//    }
//    public String getPassword(){
//        return Password;
//    }
//
//
//    public static void main(String[] args){
//        Test t1 = new Test();
//        t1.setUsername("Sangit Pandey");
//        t1.setPassword("Pandey Sangit");
//        System.out.println("Your password is: "+t1.getPassword());
//        System.out.println("Your username is: "+t1.getUsername());
//    }
//}



//=============================== Abstraction ===============================

//import java.util.*;
//
//
//    abstract class Account{
//        abstract void Username();
//        abstract void Password();
//        Scanner sc = new Scanner(System.in);
//    }
//    class Detail extends Account{
//
//        void Username(){
//            String username = sc.next();
//        }
//        void Password(){
//            String password = sc.next();
//        }
//    }
//public class Test{
//    public static void main(String[] args){
//
//        Account ac = new Detail();
//        ac.Username();
//
//    }
//}


//=============================== Encapsulation ===============================

// class Student {
//
//     private String StudentName;
//     private int StudentRoll;
//     private int StudentClass;
//     private double StudentMarks;
//
//
//
//     // Setter Method
//     public void setRoll(int RollNumber) {
//         StudentRoll = RollNumber;
//     }
//
//     public void setName(String studentName) {
//         StudentName = studentName;
//     }
//
//     public void setClass(int studentClass){
//
//     StudentClass = studentClass;
//     }
//     public void setMarks(int studentMarks){
//         StudentMarks = studentMarks;
//     }
//
//     // Getter Method
//
//     public int getRoll(){
//       return  StudentRoll;
//     }
//     public String getStudentName(){
//         return StudentName;
//     }
//     public int getStudentClass(){
//         return StudentClass;
//     }
//     public double getStudentMarks(){
//         return StudentMarks;
//     }
// }
//
// public class Test{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//
//         // Taking input data
//         System.out.println("Please enter Student roll number");
//         int sRoll = sc.nextInt();
//         System.out.println("Please enter Student Name");
//         String sName = sc.next();
//         System.out.println("Please enter Student Class");
//         int sClass = sc.nextInt();
//         System.out.println("Please enter Student Marks");
//         int sMarks = sc.nextInt();
//
//         Student s1 = new Student();
//         s1.setRoll(sRoll);
//         s1.setName(sName);
//         s1.setClass(sClass);
//         s1.setMarks(sMarks);
//
//         System.out.println("Student Roll number is: "+s1.getRoll());
//         System.out.println("Student Name is: "+s1.getStudentName());
//         System.out.println("Student Class is: "+s1.getStudentClass());
//         System.out.println("Student Marks is: "+s1.getStudentMarks());
//
//     }
// }


