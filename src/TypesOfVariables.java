


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

class test{
    int x;
    double d;
    boolean b;
    String s;
    public static void main (String[] arg){
        test t1 = new test();
        System.out.println(t1.x); //--------0
        System.out.println(t1.d); // -------0.0
        System.out.println(t1.b); // -------false
        System.out.println(t1.s); // -------null
    }


}

//        instance variables also known as object level variables or attributes.
//        If the value of a variable is not varied from object to object then it is not recommended to declare variable as instance variable.
        //   We have to declare such types of variable at class level by using static modifier
        //In the case of instance variables for every objects the separated copy is created but in the case of static
        // variables single copy will be created at the class level on the shared by every object of the class.
        //Static variable should be declare within the class directly but outside of any block or method or constructor
        //Static variables will be created at the time of class loading and destroyed at the time of unloading. Hence, scope of static variable is exactly same as scope of dot class file.
class Student{
    String name;
    int rollno;
   static String sname;
}





