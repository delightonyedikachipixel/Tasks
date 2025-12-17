import java.util.Scanner;

public class Comparator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        if (first == second) {
            System.out.println(0);
        } else if (first > second) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

       
    }
}

