package OperatorsAndAssignment;

public class IncrementAndDecrement {

    public static void main(String[] args){

    /*
    ======================== Increment and Decrement Operator

    int x = 10;
    int y = ++x;
    System.out.println(y);      // 11

    int x = 10;
    int y = ++10;               // needs variable not constant value
    System.out.println(y);

    int x = 10;
    int y = ++(++x);            // Error CE
    System.out.println(y);

    First (++x) will become 11 and then ++ operator can't increment const value

        --------- final ----------
        final x = 10;
        x++;                    Can't assign in final keyword because it is the final value and final is constant.

                                but we can assign increment/decrement operator in all primitive type except boolean

        char ch = 'a';
        ch++;
        System.out.println(ch); ans: 'b'

       ======================== Difference between b = b+1 and b++ ==============================

       If we apply any arithmetic operator between two variables a and b the result will always

       --> max(int, type of a, type of b)
       --> byte a = 10;
       --> byte b = 20;
       --> byte c = a + b; // Max(int, type of a, type of b)
                System.out.println(c);      Compile time Error
                -----------------------------
                -----------------------------
                -----------------------------
       --> byte c = (byte) (a+b);           Type Casting
                System.out.println(c);      30

                Type casting =>            byte c = (byte) (a+b);

                byte b = 10;
                b = b + 1;                   MAX(int,byte,int)
                System.out.println(b);       Compile time error

                TO solve this-->        b = (byte) (b+1) // 11

                        // ==================== internal type casting / automatically type casting ====================

                        b++;        (type of b) (b+1);  // internal type casting





     */



    }
}
