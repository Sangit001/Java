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

    Automatic promotion in overloading while resolving overloaded method is exact matched method are not available
    than we won't get any compile time error immediately. First it will promote argument to next level and check whether
    the matched method is available or not. If matched method is available then it will be considered, and it matched is not available
    compiler promotes argument once again to the next level this process will be continued until all possible promotions
    still if the matched not available then we will get compile time error.

    The following are all possible promotions in overloading :->

    byte -----> short -----> int -----> long -----> float -----> double
    char -----> int -----> long -----> float -----> double

    This process is called automatic promotion in overloading.

    case 1:

    class Overloading{
        public void m1(int i) {
            System.out.println("int-arg");
        }
        public void m1(float f) {
            System.out.println("floating-point-arg");
        }

    public static void main (String[] args){
            Overloading o = new Overloading();

            o.m1(10);       -----> int-arg
            o.m1(10.2f);    -----> floating-point-arg
            o.m1('a');      -----> int-arg
            o.m1(10l);      -----> floating-point-arg
            o.m1(10.5);     -----> Compile time error:- Cannot find symbol. This is double and can't promote next.
    }
    }

    case 2:


        class Overloading{
            public void m1(String s){
                System.out.println("String version");
            }
            public void m1(Object o){
                System.out.println("Object version");
            }

            public static void main(String[] args) {
                Overloading o = new Overloading();
                o.m1("sangit");     --> String Version
                o.m1(new Object());    --> Object version
                o.m1(null);         --> String version
            }

        }

 */
