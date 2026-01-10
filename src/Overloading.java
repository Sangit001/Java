 class animal{

 }
 class monkey{

 }
 class Test{
    public void m1(animal a){
        System.out.println("Animal");
    }
    public void m1(monkey m){
        System.out.println("Monkey");
    }
 }

public class Overloading{
    public static void main(String[] args){

        Test t = new Test();
        animal a = new animal();
        monkey m = new monkey();
        t.m1(a);
        t.m1(m);
    }
}