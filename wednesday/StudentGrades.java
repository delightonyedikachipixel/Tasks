import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        for (int counter = 1; counter <= 5; counter++) {

            System.out.print("Enter student name: ");
            input.nextLine();

            System.out.print("Enter student grade (A, B, C, D): ");
            char grade = input.next().charAt(0);

            switch (grade) {
                case 'A':
                    aCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'D':
                    dCount++;
                    break;
            }
        }

        System.out.println("Number of A grades: " + aCount);
        System.out.println("Number of B grades: " + bCount);
        System.out.println("Number of C grades: " + cCount);
        System.out.println("Number of D grades: " + dCount);

        input.close();
    }
}

