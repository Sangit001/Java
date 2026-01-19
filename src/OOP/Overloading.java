package OOP;

// ================================> OVERLOADING <================================
/*

    -> Overloading is the process where two methods have same name but different argument type.
    -> In C programming there is no such concept called Overloading we cannot declare same method name even
    the argument type are different.

    -> But in Java we can declare multiple method with the same name but, different argument type such type
    of methods are called Overloaded.
    Eg:-

    abs (int i)
    abs (float f)
    abs (double d)

    -> Overloading concept in Java reduce complexity of a program.

    class Overloading {
    public void m1() {
        System.out.println("non-arg type");
    }

    public void m1(int i) {
        System.out.println("int-arg type");
    }

    public void m1(float f) {
        System.out.println("floating-point-arg type");
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.m1();            //  -> non-arg type
        t.m1(10);       //  -> int-arg type
        t.m1(10.5f);   //   -> floating-point-arg type
    }
}

    -> In overloading method resolution takes care by compiler based on reference type.
    -> Hence, overloading is also considered as (compile time polymorphism / static polymorphism / early binding).




 */