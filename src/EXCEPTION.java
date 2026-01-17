

public class EXCEPTION{
    public static void main(String[] args){
        try{
            int firstNumber = 20, secondNumber = 0, result;
            result = firstNumber/secondNumber;
        }catch(ArithmeticException ae){
            System.out.println("Comes error");
        }
        System.out.println("Program runs successfully");
    }
}