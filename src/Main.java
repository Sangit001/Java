
class Student{

}
class Customer{

}

public class Main{
    public static void main(String[] args) throws Exception {

Thread t = new Thread();
        System.out.println(Class.forName(args[0]).isInstance(t));
    }
}