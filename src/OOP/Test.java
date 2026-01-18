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



//=============================== Inheritance / Is-a Relationship ===============================


//class Animal{
//    void dog(){
//        System.out.println("Domestic");
//    }
//    void goat(){
//        System.out.println("Domestic");
//    }
//    void tiger(){
//        System.out.println("Wild");
//    }
//}
//
//class AddedAnimals extends Animal{
//
//    void Lion(){
//        System.out.println("Wild");
//    }
//
//}
//class Test{
//    public static void main(String[] args){
//
//        Animal a1 = new AddedAnimals();
////        a1.Lion()  // We cannot user lion because it is the property of AddedAnimal (Child class) but we can use dog() instead
//        a1.dog();
//        // we can use both Property of parent class (Animal) and child class itself
//        AddedAnimals a2 = new AddedAnimals();
//        a2.Lion();
//        a2.goat();
//
//    }
//}



//=============================== Multi level inheritance ===============================

// We can make multiple child class of any class

//class Car{
//    void bmw(){
//        System.out.println("It is BMW");
//    }
//    void mercedes(){
//        System.out.println("It is Mercedes");
//    }
//}
//class Color extends Car{
//    void red(){
//        System.out.println("Color Red");
//    }
//    void black(){
//        System.out.println("Color black");
//    }
//}
//class CarDetails extends Color{
//    void price(){
//        System.out.println("Price around $100,000");
//    }
//}
//
// class Test{
//    public static void main(String[] args){
//        CarDetails cd = new CarDetails();  // Child class can access its parent methods, parents inheritance comes automatically to child one.s
//        cd.bmw();
//        cd.mercedes();
//        cd.red();
//        cd.black();
//        cd.price();
//    }
//
//}

//public class Test{
//
//    public static void main(String[] args){
//        int sum = 0;
//        int[] array = {1,2,3,4,5,6,7,8,9,10};
//        for(int i = 0; i <= array.length-1; i++){
//            if(array[i] % 2 == 0) {
//                sum = sum + array[i];
//            }
//        }
//        System.out.println(sum);
//    }
//}


// ============================> Has a Relationship <==============================


//Has a relationship is also known as composition and aggregation.

class car{
    Engine e = new Engine();
}
//Car has a Engine reference.

class Engine{

}



// ============================> Method signature <==============================

//In java Method signature consist of method names followed by argument types.

// public static void m1(String name, int age)
//      -> m1(String name, int age) is method signature
//      -> return type (void) is not a part of method signature

// With in a class two methods with the same signature are not allowed.

/*
class Test{
    public void m1(int age){
        System.out.println("void return type");   // -> void return type
    }
    public int m1(int age){
        System.out.println("int return type");    // -> int return type
    }
}
 */
// Though the return type are different but in method signature it does not play any role.