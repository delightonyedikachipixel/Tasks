import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountNumber;

        System.out.print("Enter account number : ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.println("New balance is: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            
        }
    }
}

