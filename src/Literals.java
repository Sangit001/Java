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

//        char cha = 0xface;
//        char ch = 077777; right
//        char ch = 65535;
//        char ch = 65536; throws an error cause max range of char is 65535 and goes above that it becomes int
//        System.out.println(ch);


//boolean isThereAnyThing = false;
//        System.out.println(isThereAnyThing);


//        character literals------------------->
//        1) single character with single quote --------> char a = 'a';
//        2) corresponding unicode value -------> char a = 97;
//        3) unicode representation ---------> char a = '\u0061';
//        System.out.println(a);

//        4) Escape characters
//        \n -> new line
//        \t -> horizontal tab
//        \r -> carriage return
//        \b -> backspace
//        \f -> form feed
//        \' -> single quote
//        \" -> double quote
//        \\ -> back slash

//        System.out.println("hello\" sangit");

//        string literal--------------------------------------->
//        any sequence of character within double is treated as string literal

//        For integral datatypes until 1.6v we can specify literal value in the following ways:-
//        Decimal form
//        Octal form
//        Hexa Decimal form
//        But from 1.7v onwards we can specify literal value even in a binary form also, allowed
//        digits are 0 and 1, literal value should he prefixer with b or B
//
//        int x = 0b1111;
//        System.out.println(x);  ans 15

//        usuage of underscore (_) symbol in numeric literals
//        From 1.7v we can use underscore symbol between digits of numeric literal
//        double d = 123456.789;
        double d = 123_456.7_8_9;
//        The main adv of this approach is readibility of the code will be improved
//        At the time of compilation this underscore symbol will be removed automatically
//        hence after compilation the above lines become double d =  123456.789;
//          We can use more than one underscore  symbol between digits
        double db = 1_____2____4_____8;

//          We can assign lower value datatype to higer value datatype

//        byte -----> short -----> int -----> long -----> float -----> double
//        chat -----> int -----> long -----> float -----> double
//          8 byte long value we can assign to 4 byte float variable because both are following
//        different memory representation internally
//        float f = 10l;
//        System.out.println(f);  ans 10.0
//
//        double a = 10;
//        System.out.println(a);


    }
}