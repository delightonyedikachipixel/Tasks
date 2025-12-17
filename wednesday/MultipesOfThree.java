import java.util.Scanner;


public class MultiplesOfThree {

    public static void main(String[] args) {

        int sum = 0;

        for (int counter = 1; counter <= 30; counter++) {
            if (counter % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of integers divisible by 3 between 1 and 30: " + sum);
    }
}

