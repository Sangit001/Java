

//  1.  Write a Java program to declare two integers and print their sum, difference, product, and division.
//	2.	Write a program to check whether a given number is even or odd.
//	3.	Write a program to find the largest of three numbers using if-else.
//	4.	Write a program to print numbers from 1 to 10 using a loop.
//	5.	Write a program to calculate the factorial of a number using for loop.


//public class PracticeQuestion{
//    public static void main(String[] args){
//        int num1 = 10;
//        int num2 = 2;
//        int sum = num1+num2;
//        int difference = num1-num2;
//        int product = num1*num2;
//        int division = num1/num2;
//        System.out.println("Sum is "+sum+" \nDifference is "+difference+" \nProduct is "+product+" \nDivision is "+division);
//    }
//}


//public class PracticeQuestion{
//    public static void main(String[] args) {
//
//        int number = 20;
//        if(number % 2 == 0){
//            System.out.println("This is even");
//        }
//        else{
//            System.out.println("This is odd");
//        }
//    }
//
//}

//public class PracticeQuestion{
//    public static void main(String[] args) {
//        int largest = 0;
//
//        int firstNum = 1;
//        int secondNum = 8;
//        int thirdNum = 15;
//
//        if(firstNum > largest){
//            largest = firstNum;
//
//            if (secondNum > largest) {
//                largest = secondNum;
//                if (thirdNum > largest) {
//                    largest = thirdNum;
//                }
//
//            }
//
//            }
//
//
//        System.out.println("The largest is: " + largest);
//    }
//
//}


//public class PracticeQuestion{
//    public static void main(String[] args){
//        for(int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }
//    }
//}

//public class PracticeQuestion{
//    public static void main(String[] args){
//        int fact = 1;
//        int n = 5;
//        for(int i=1;i<=n;i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }
//}

//class square{
//    int number = 4;
//    void square(){
//        int square = number*number;
//        System.out.println(square);
//    }
//}
//
//public class PracticeQuestion{
//    public static void main(String[] args){
//square s1 = new square();
//s1.square();
//    }
//}


class calculator{
    int num1 = 10;
    int num2 = 20;
    int add(){
        return num1+num2;
    }
    int sub(){
        return num1-num2;
    }
    int mul(){
        return num1*num2;
    }
    int div(){
        return num1/num2;
    }
}

public class PracticeQuestion{
    public static void main(String[] args){

        calculator cal = new calculator();
        cal.add();
        System.out.println(cal.add());


    }


    }