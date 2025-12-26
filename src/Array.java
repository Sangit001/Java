public class Array{
    public static void main(String[] arg) {

//        1. introduction
//        2. array declaration
//        3. array creation
//        4. array creation
//        5. array declaration, creation and initialization in single line
//        6. length vs length()
//        7. anonymous array
//        8. array element assignments
//        9. array variable assignments
//


//        Introduction
//        An array is indexed collection of fixed number of homogeneous data elements in a single variable
//        The main adv of an array is
//        We can represent huge number of value by using single variable so that the readability of the code will be improved
//    The disadv of an array is:
//        Once we create an array there is no chance of increasing or decreasing the size based on our requirements
//        Hence to use array concept compulsory we should know the size in advance, which may not possible always.


//        2. Array Declaration

//        --------------------  [One Dimensional] array declaration------------------

//        int[] x;  -------------> commended because name is clearly separated from type
//        int []y;
//        int z[];


//        int [6] x; ----> wrong because at the time of declaration we cannot specify the size
//        otherwise we will get compile time error.


//        --------------------  [Two Dimensional] array declaration------------------

//        Valid deceleration----------------->

//        int[][]  x;
//        int  [][]x;
//        int  x[][];
//        int[]  []x;
//        int[]  x[];
//        int  []*[];

//        Which of the following are valid
//        int[] a,b;  a-->1  b--1
//        int[] a[],b;  a-->2  b-->1
//        int[] a[],b[];  a-->2  b-->2
//        int[] []a,b;   a-->2  b-->2
//        int[] []a,b[];  a-->2  b-->3
//        int[] []a,[]b;  ------invalid if we want to specify dimension before the variable the facility is applicable
//        only for first variable in a declaration, if we are trying to apply for next variable we will compile time error


//        --------------------  [Three Dimensional] array declaration------------------


//        Valid identifiers of three-dimensional array
//        int [][][] a;
//        int  [][][]a;
//        int  a[][][];
//        int[]  [][]a;
//        int [][] []a;
//        int[]  []a[];
//        int [][] a[];
//        int []  a[][];
//        int  [][]a[];
//        int  []a[][];


//        3. Array creation------------------------------------->
//    Every array in java is an object only hence we can create an arrays by using new operator

//        int[] a = new int[3];  // a is reference for this object
//        System.out.println(a.getClass().getName());
//        for every array type corresponding classes are available under these classes are part of java language
//        and not available to the programmer level.
//
//        ---------------------Array type and their corresponding class name----------------------
//        Array type          Corresponding class name

//        int[]     --------->  [I
//        int[][]   --------->  [[I
//        double[]  --------->  [D
//        short[]   --------->  [S
//        byte[]    --------->  [B
//        boolean[] --------->  [Z

//        int[] x = new int[] ----> at the time of array creation compulsory we should specify the size
//        otherwise we will get compile time array.
//        int[] x = new int[6];
//        int[] y = new int[0];  //It is legal to have an array with the size 0 in java.
//        System.out.println(x.length);
//        System.out.println(y.length);
//        System.out.println(arg.length);

//        int[] z = new int[-3]; ---> if we are trying to specify with some negative int value then we will
//        get run time exception saying negative array size exception.

//-----> To specify array size that allowed datatypes are byte, short, char and int if we are trying any other type then
//        we will get compile time error.
//        int[] a = new int[10];
//        byte b = 33;
//        int[] c = new int[b];
//        short d = 55;
//        int[] e = new int[d];
//        int[] character = new int['a'];
//        char[] forA = new char[1];

//        int[] p = new int[10l];----------> incorrect / invalid
//        System.out.println(forA);
//        System.out.println(character);


//        ----------------------- Max length of an array in int datatype-------------------------
//        int[] maxLength = new int[2147483647]; // ----------> the max allowed array size in java is 2147483647
        // which is the maximum value of int datatype.
//        Even in the first case we may get run time exception if sufficient heap memory not available
//        int[] overFlow = new int[21474836348];  ---------this overflow the range


//        ==============================  Two dimensional array creation  ================================

//        ------------------------------------ ARRAY of ARRAYS----------------------------------
//
//        --------------> in java two dimensional array is no implemented by using matrix representation
//        SUN people followed array of arrays approach for multidimensional array creation
//        =============  The main advantage of this approach is  =============
//        <-------------  Memory utilization is improved  ---------------->

//        int[][][] x = new int[2][][];// -----------------> Three dimensional array
//        x[0] = new int [3][];
//        x[0][0] = new int[1];
//        x[0][1] = new int[2];
//        x[0][2] = new int[3];
//        x[1] = new int[2][2];

//        int[] a = new int[];              --------> invalid
//        int[] a = new int[3];             --------> valid
//        int[][] a = new int[][];          -------> invalid
//        int[][] a = new int[][3];         --------> invalid
//        int[][] a = new int [2][3];       --------> valid
//        int[][] a = new int[2][];         --------> valid
//        int[][][] a = new int[5][4][3];   --------> valid
//        int[][][] a = new int[][3][3];    --------> invalid
//        int[][][] a = new int[3][][6];    --------> invalid
//        int[][][] a = new int[3][5][];    --------> valid

//        int[] t = new int[3];
//        System.out.println(t); ----------->[I@27716f4
//        System.out.println(t[0]);
//       NOTE: Whenever we are trying to print any refrence variable internally two string method will be called,
//       which is implmented by default to return the string in the following form:-
//       {classname@hashcode_in_hexadecimal form}

//        once we create an array every element by default initializer with default values


//        *Eg.2*
//        int[][] p = new int[2][3];
//        System.out.println(p); ----------->[[I@3r212
//        System.out.println(p[0]); -------->[I@43r34
//        System.out.println(p[0][0]); ----->0

//            *Eg.3*
//        int[][] m = new int[2][];
//        System.out.println(m); ------->[I$540r4;
//        System.out.println(m[0]); ------>null
//        System.out.println(m[][]);------>RE: NPE


//        Once we creates an array every array element by default initializer with default values
//        if we are not satisfied with default values then we can overwrite these values with our customized values.

//        int[] array = new int[6];
//        array[0] =10;
//        array[1] =100;
//        array[2] =20;
//        array[3] =200;
//        array[4] =30;
//        array[5] =300;
//        array[2.5] = 40; ------> invalid CE:- PLP Found: double Required: int


//      ---------------------  Array Declaration, creation and initialization in a single line  -----------------------


//        We can declare creat in a single line (shortcut representation)
//        int[] x;
//        x = new int[3];
//        x[0] = 10;
//        x[1] = 20;
//        x[2] = 30;

//        but in single line
//        int[] x = {10,20,30};
//        char[] ch = {'a','e','i','o','u'};
//        String[] st = {"A","AA","AAA","AAAA"};

//        We can extend this shortcut even for multidimensional arrays also
//        int[][] x = {{20,30},{40,50,60}};

//        {
//        int[][][] x = new int[2][3][2];
//        int[][][] a = {{{10,20}, {30,40},{50,60}}, {{70,80}, {80,90},{90,100}}};
//    }

//       {
//       int[] x;
//        x = {10,20,30};
//    } ///// CE: illegal start of expression, if we want to use that shortcut compulsory
//    we should perform all activity in a single line.








//        ---------------------------6. length   vs     length() --------------------------------

//        length:---------->

//        -------> length is a final variable applicable for arrays
//        -------> length variable represent the size of an arrays
//                    int[] p = new int[6];
//        System.out.println(p.length());  -------->  CE: cannot find symbol/ symbol: method length() Location: class int[].
//        System.out.println(p.length);


//        length() ---------->
//        -------> length() method is a final method applicable for String objects.
//        -------> length() returns number of characters present in the String

//        CONCLUSION: length variable is applicable but not in String objects, whereas length()
//        is applicable for String objects but not for arrays.

        String[] s = {"a","aa","aaa","aaaa"};
        System.out.println(s.length); // ans: 4
//        System.out.println(s.length());  compile time error symbol not found
//        System.out.println(s[0].length);  compile time error symbol not found
        System.out.println(s[0].length()); // ans: 1




//        In multidimensional arrays length variables represent only base size but not a total size.
//        In multidimensional arrays length variables represent only base size but not a total size.
//        In multidimensional arrays length variables represent only base size but not a total size.
        int[][] x = new int[6][3];
        System.out.println(x.length); // answer 6
        System.out.println(x[0].length); // answer 3

//        There is no direct way to find total length of multidimensional array, but indirectly we can find as follows:
        System.out.println( x[0].length+x[1].length+x[2].length);




//        --------------------------->  anonymous array  <------------------------------------
//        Sometimes we can declare an array without name such type of nameless array are called anonymous arrays.
//        The main purpose of an anonymous array is just for instant use ( 1 time usage ).
//        We can create an anonymous are as follows:
//          While creating an anonymous array we can't specify sizes.
//        new int[] {10,20,30,40}; -----> valid
//        new int[2] {10,20,30,40} -----> invalid

        class test{
            public static void main(String[] arg){
                sum(new int[]{10,20,30,40});

            }
            public static void sum(int[] j){
                int total = 0;
                for (int j1:j){
                    total = total+j1;
                }
                System.out.println("The sum is"+total);
            }
        }


//        We can create multidimensional anonymous array by:
//        new int[] {{10,20,30,40},{60,70,80,90}};

//        Based on our requirement we can give the name for anonymous array then it is no longer anonymous.
//        int[] x = new int[] {10,20,30,40};

//        The above example just to call sum method we required an array but after completing sum method call
//        we are not using that array anymore. Hence, for this one time requirements anonymous array is the best choice.

        int[] b = new int[5];
//        b[0] =10;
//        b[1] = 'a';
//        byte v = 20;
//        b[2] = v;
//        short sh =30;
//        b[3] = sh;
//        b[4] = 40l;  mistake PLP found long required int




}



}