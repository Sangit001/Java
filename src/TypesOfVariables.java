


//        Based on type of value represented by a variable all variables are divided into two types
//        Primitive variables can be used to represent primitive values eg = int x = 10;
//        Reference variables can be used to refer Objects eg: student s = new student();

//        Division 2:
//        Based on position of declaration and behaviour all variables are divided into three types:
//        1. Instance variables
//        2. Local variables
//        3. Static (or class) variables


//        =========================== Instance variables =========================
//        If the value of a variables is varied from object to object, such types of variables are called instance variables.
//    EG:

//class Test{
//    int x = 10;
//}
//public class TypesOfVariables {
//
//
//    public void main(String[] arg) {
//        Test t = new Test();
//        System.out.println(t.x);
//
//    }
//
//}


// For intance variables JVM will always provide default values and we are not required to perform initialization explicitly.

//class test{
//    int x;
//    double d;
//    boolean b;
//    String s;
//    public static void main (String[] arg){
//        test t1 = new test();
//        System.out.println(t1.x); //--------0
//        System.out.println(t1.d); // -------0.0
//        System.out.println(t1.b); // -------false
//        System.out.println(t1.s); // -------null
//    }
//
//
//}

//        instance variables also known as object level variables or attributes.
//        If the value of a variable is not varied from object to object then it is not recommended to declare variable as instance variable.



//                    ==================== Static Variable ====================


        //   We have to declare such types of variable at class level by using static modifier
        //In the case of instance variables for every objects the separated copy is created but in the case of static
        // variables single copy will be created at the class level on the shared by every object of the class.
        //Static variable should be declare within the class directly but outside of any block or method or constructor
        //Static variables will be created at the time of class loading and destroyed at the time of unloading. Hence, scope of static variable is exactly same as scope of dot (.)class file.
//class Student{
//    String name;
//    int rollno;
//   static String sname;
//}

//java text
//1. Start JVM
//2. Create and start main Thread
//3. Locate Test.class file
//4. Load Test.class - -------------- At this time static variable Created
//5. Execute main() method
//6. Unload Test.class - ------------ At this time static variable Destruction
//7. Terminate main Thread
//8. Shutting down JVM
//

//Static variables will be stored in method area.
//We can access a static variables either by object reference or by class name but recommended to use class name,
// but with in the same class it is not required to use class name and we can access directly.
//We can access static variables directly from both instance and the static areas.

//class test{
//    static int x = 10;
//public class TypesOfVariables{
//}
//public static void main(String[] arg){
//    test t = new test();
//    System.out.println(t.x);
//    System.out.println(test.x);
//    System.out.println(x);
//
//}
//public void m1(){
//    System.out.println(x);
//}
//}



//For static variables JVM will provide default values we are not required to perform initialization explicitly
//class test{
//    static int x;
//    static double d;
//    static String s;
//}
//public static void main(String[] arg){
//    System.out.println(x);
//    System.out.println(d);
//    System.out.println(s);
//
//}

//static variables also known as class level variables or fields



//======================= IMPORTANT THING ABOUT INSTANCE AND STATIC VARIABLES ============================

class Test {
    static int x = 10;
    int y = 20;
    public static void main(String[] args){

        Test t1 = new Test();
        t1.x = 888;
        t1.y = 999;

        Test t2 = new Test();
        System.out.println(t2.x+"--"+t2.y);
    }
}
