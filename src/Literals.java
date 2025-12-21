public class Literals{
    public static void main(String[] arg){


//        What is literals?
//        Any constant value which can be assigned to the variable is called literals.
//        eg:- int x = 10;
//        int = keywords
//        x = variable
//        10 = constant / literal

//        integral literals

//        For integral datatype (byte, short, int, long) we can specify literal value in the following ways:-
//        1) decimal literals / form (base-10)
//     ---  allowed digits are 0-9
//        2) octal literal / form (base-8)
//     --- allowed digits 0-7
//        literal value start with 0
//        eg:- int x = 010;

//        3) hexa decimal form (base-16)
//     --- allowed digits are 0-9, a-f
//        { we can use both lower and upper case in this part java is no case sensitive }
//        The literal value should be prefixer with OX or ox.
//        eg: int x = 0X10;

//        int x = 0X10;
//        System.out.println(x);  ans 16
//
//        int a = 0xFace;
//        System.out.println(a); ans  64206

//        int b = 0xBeer;
//        System.out.println(b);   ans: error R-r is not allowed because hexa decimal form has only a-f not r



//         By default ever integral literal is of (int type) but we can specify explicitly
//         long type at the end of constant with the l or L.


//        int x = 10;  correct
//        long l = 10l;
//        int x = 10L;  incompatible types because required int found long
//        long l = 10; correct
//        System.out.println(l);

//        char ch = 'a'; ans a
//        char ch  = "abcs";    ans abcs
//          this is the correct answer ("") is for string and ('') for a single character
//        System.out.println(ch);
//        char a = 97;  ans a

//      char cha = 0xface;
//        char ch = 077777; right
//        char ch = 65535;
//        char ch = 65536; throws an error cause max range of char is 65535 and goes above that it becomes int
//        System.out.println(ch);


boolean isThereAnyThing = false;
        System.out.println(isThereAnyThing);


    }
}