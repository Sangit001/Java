package OperatorsAndAssignment;

public class EqualityOperators {
    public static void main(String[] args){
/*
        We can apply equality operator for every primitive type including boolean also.
            System.out.println(10 == 20);           false
            System.out.println('a' == 'b');         false
            System.out.println('a' == 97.0);        true
            System.out.println(false == false);     true

        We can apply equality operator for object types also. For object references.
        r1, r2
            r1 == r2    true
            if and only if both are pointing to the same object (references comparision are address comparision).

            Example:-   Thread t1 = new Thread();
                        Thread t2 = new Thread();
                        Thered t3 = t1;
                        System.out.println(t1 == t2);   false
                        System.out.println(t1 == t3);   true

                        If we apply equality operator for object type then compulsory there should be relation between
                        argument types. (Either child -> Parent), (Parent -> Child) or same type otherwise we will get
                        compile time error saying incomparable types.

                        Thread t = new Thread();
                        Object o = new Object();
                        String s = new String("Sangit");

                        System.out.println(t2 == o);    false
                        System.out.println(o == s);     false
                        System.out.println(s == t);     compiletime error--> incomparable types.

 */

    }
}
