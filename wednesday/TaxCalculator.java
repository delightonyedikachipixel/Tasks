import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int counter = 1; counter <= 3; counter++) {

            System.out.print("Enter citizen name: ");
            String name = input.nextLine();

            System.out.print("Enter yearly earnings: ");
            double earnings = input.nextDouble();
            input.nextLine(); // clear buffer

            double tax;

            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else if  (earnings >30000) {
                tax = earnings * 0.20;
            }

            System.out.println("Citizen: " + name);
            System.out.println("Total Tax: $" + tax);
            
        }

        
    }
}

