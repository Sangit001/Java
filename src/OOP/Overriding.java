package OOP;


class P{
    public void m1(int x){
        System.out.println("parent");
    }
}
class C{
    public void m1(int x){
        System.out.println("child");
    }
}
public class Overriding {
    public static void main(String[] args){
        P p1 = new P();
        p1.m1(10);
        C c1 = new C();
        c1.m1(20);
    }
}

/*
Overriding is also known as Run time polymorphism / Dynamic polymorphism / late binding
In overriding JVM will take care of method resolution based on run time.
 */
