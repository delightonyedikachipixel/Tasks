import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Enter a five-digit integer: ");
            number = input.nextInt();

            if (number >= 10000 && number <= 99999) {
                break;
            } else {
                System.out.println(" Number must be five digits.");
            }
        }

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int fourthDigit = (number / 10) % 10;
        int lastDigit = number % 10;

        if (firstDigit == lastDigit && secondDigit == fourthDigit) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

       
    }
}

