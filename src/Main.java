import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable and scanner initializations
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        int attempt = 3, balance = 1500, selection;

        while (attempt > 0) {

            System.out.println("Please enter your user name: ");
            userName = scanner.nextLine();

            System.out.println("Please enter your password: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){

                System.out.println("Welcome!");
                do {
                    System.out.println("What would you like to do today?\n 1- Deposit Cash\n 2- Withdraw Cash\n 3- Check your account balance\n 4- Return my card");
                    System.out.print("Please make your choice:");
                    selection = scanner.nextInt();
                    scanner.nextLine();

                    switch (selection) {
                        case 1:
                            System.out.print("Enter the amount you will deposit: ");
                            int deposit = scanner.nextInt();
                            balance += deposit;
                            System.out.println("Your balance is now: " + balance);
                            break;
                        case 2:
                            System.out.print("Enter the amount you will withdraw: ");
                            int withdrawal = scanner.nextInt();
                            if ( withdrawal > balance){
                                System.out.println("Insufficient funds");
                            } else {
                                balance -= withdrawal;
                                System.out.println("Your balance now is: " + balance);
                            }
                            break;
                        case 3:
                            System.out.print("Your balance is " + balance + " TL.");
                            break;
                        default:
                    }
                } while(selection !=4);
                System.out.println("Good bye.");
                break;
            } else {
                attempt--;
                System.out.println("You have entered an incorrect password. Please try again.");
                if (attempt == 0) {
                    System.out.println("Your account has been blocked. Please contact your representative.");
                } else {
                    System.out.println("You have " + attempt + " attempts remaining.");
                }
            }
        }
    }
}