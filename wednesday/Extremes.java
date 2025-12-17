import java.util.Scanner;

public class Extremes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int count = input.nextInt();

        System.out.print("Enter number 1: ");
        int number = input.nextInt();

        int min = number;
        int max = number;

        for (int counter = 2; counter <= counter; counter++) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        int sum = min + max;

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of min and max: " + sum);

        
    }
}

