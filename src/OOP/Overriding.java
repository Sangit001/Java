package OOP;
/*

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
*\

/*
Overriding is also known as Run time polymorphism / Dynamic polymorphism / late binding
In overriding JVM will take care of method resolution based on run time.


        Rules for Overriding
        In Overriding method names and the arguments type must be matched (Method signature must be same)
        or we can take co-variant return type. According to this child class method return type need not be same
        as parent method return type, its child type also allowed.

        class P
        {
        public Object m1()
            {
                return null;
            }
        }
        class C extends P
        {
        public String m1()
            {
                return null;
            }

        }


        Parent class method return type ---->   Object                      Number           String      Double
        Child class method return type  ---->   Object/String/StringBuffer  Number/intiger   Object ❌   Int ❌

        Covariant return type ---> It is applicable only for Object types but not for primitive types.

        ----> Parent class private method not available to the child, Overriding concept not applicable for private method.
        ----> Based on our requirement we can define exactly same private method in child class it is valid but not Overriding.

 */
