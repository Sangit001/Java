// class animal{
//
// }
// class monkey{
//
// }
// class Test{
//    public void m1(animal a){
//        System.out.println("Animal");
//    }
//    public void m1(monkey m){
//        System.out.println("Monkey");
//    }
// }
//
//public class Overloading{
//    public static void main(String[] args){
//
//        Test t = new Test();
//        animal a = new animal();
//        monkey m = new monkey();
//        t.m1(a);
//        t.m1(m);
//    }
//}

//============ General vs Var-arg method

class Test{
    public void m1(int x){
        System.out.println("This is general method");
    }
    public void m1(int...y){
        System.out.println("This is var-arg method");
    }

}
public class Overloading {
public static void main(String[] args){
    Test t1 = new Test();
    t1.m1();
    t1.m1(10);
    t1.m1(20,30,40);
}
}
