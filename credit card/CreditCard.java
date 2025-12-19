import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter credit card number:");
        long creditCardNumber = input.nextLong();

        if (isValid(creditCardNumber)) {
            System.out.println("Credit card number is valid.");
            System.out.println("Card Type: " + getCardType(creditCardNumber));
            System.out.println("Card Length: " + getNumberOfDigits(creditCardNumber));
        } else {
            System.out.println("Credit card number is invalid.");
            System.out.println("Card Type: " + getCardType(creditCardNumber));
            System.out.println("Card Length: " + getNumberOfDigits(creditCardNumber));
        }
    }

    public static boolean isValid(long number) {
        return (sumOfDoubleEvenNumber(number) + sumOfOddNumber(number)) % 10 == 0;
    }

    public static int sumOfDoubleEvenNumber(long number) {
        int sum = 0;
        number /= 10;

        while (number > 0) {
            sum += getDigit((int) ((number % 10) * 2));
            number /= 100;
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        }
        return number / 10 + number % 10;
    }

    public static int sumOfOddNumber(long number) {
        int sum = 0;

        while (number > 0) {
            sum += (int) (number % 10);
            number /= 100;
        }
        return sum;
    }

    public static int getNumberOfDigits(long number) {
        return String.valueOf(number).length();
    }

    public static String getCardType(long number) {
        String numStr = Long.toString(number);
        int firstDigit = numStr.charAt(0) - '0';
        int secondDigit = numStr.charAt(1) - '0';
        int firstTwoDigits = firstDigit * 10 + secondDigit;

        if (firstDigit == 4) {
            return "Visa";
        } else if (firstDigit == 5) {
            return "MasterCard";
        } else if (firstTwoDigits == 37) {
            return "American Express";
        } else if (firstDigit == 6) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }
}

