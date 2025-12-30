import java.util.Deque;
import java.util.Scanner;

abstract class BankingMind{
abstract void Deposite();
abstract void Withdraw();
abstract void CheckBalance();
abstract void AskUser();

}
 class Process extends BankingMind {
     Scanner sc  = new Scanner(System.in);
     int UserBalance = 2999999;

    void Deposite(){

        int UserDeposite = sc.nextInt();
        UserBalance = UserBalance+ UserDeposite;
        System.out.println("You have successfully deposited "+UserDeposite);
    }
    void Withdraw(){
        System.out.println("Please enter your withdraw amount");
        int UserWithdraw = sc.nextInt();
        if(UserWithdraw > UserBalance ){
            System.out.println("You have insufficient money.\n Try again.\n 1. Check Balance.\n 2. Withdraw");
            byte userFail = sc.nextByte();
            switch(userFail){
                case 1: {
                    CheckBalance();
                break;
                }
                case 2:{
                    Withdraw();
                break;
                }
            }
        }
        UserBalance = UserBalance - UserWithdraw;

    }


     void CheckBalance() {

         System.out.println("Your balance is: "+ UserBalance);
     }


     void AskUser() {
         System.out.println("1. Check your current balance.");
         System.out.println("2. Money Withdraw.");
         System.out.println("3. Money Deposite.");
         System.out.println("4. Cancel.");

         System.out.println("\nPlease Choose an Option: ");


         int userInput = sc.nextInt();
         switch (userInput){
             case 1: {

                 CheckBalance();
             break;
             }

             case 2: {


                 Withdraw();
                 break;

             }
             case 3:{
                 System.out.println("Please enter your deposite amount");
                 Deposite();
                 break;
             }
             case 4: {
                 break;
             }
             default: {
                 System.out.println("Choose from the Option");
                 AskUser();
                 break;
             }
         }




     }
 }


class BankingApp{

public static void main(String[] arg){
    int UserBalance = 2999999;
    Scanner sc = new Scanner(System.in);
BankingMind Logic = new Process();
Logic.CheckBalance();
Logic.AskUser();








}


}