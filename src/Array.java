public class Array{
    public static void main(String[] arg){

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
        char[] forA = new char[1];

//        int[] p = new int[10l];----------> incorrect / invalid
        System.out.println(forA);
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

    }

}