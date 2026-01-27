package OperatorsAndAssignment;

public class OverloadedOperator {
    public static void main (String[] args){
/*

        The only overloaded operator in Java is (+) operator. Sometime it access arithmetic addition operator
        and sometime it access String concatination operator.

        If atleast one argument is String type (+) operator access concatination operator and if both arguments are
        number type then (+) operator access arithmetic operator.

        Example1:-   String  a = "Sangit";
                    int     b = 10, c = 20, d = 30;
                    System.out.println(a+b+c+d);      Sangit102030
                    System.out.println(b+c+d+a);    60Sangit
                    System.out.println(b+c+a+d);    30Sangit30
                    System.out.print(b+a+c+d);      10Sangit2030


                    a+b+c+d
                    "Sangit10" + c + d
                    "Sangit1020" + d
                    "Sangit102030"

        Note:-      String + Number => Concatination

        Example2:-  Consider the following declaration String a = "Sangit";
                    int b = 10, c = 20, d = 30;
        Question:-  Which of the following expression are used are valid?
                    1.  a = b+c+d;
                    2.  a = a+b+c;
                    3.  b = a+c+d;
                    4.  b = b+c+d;



 */

    }
}
