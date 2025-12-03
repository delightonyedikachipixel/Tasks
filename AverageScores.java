import java.util.Scanner;
    public class AverageScores{
        public static void main(String[]args){          
            Scanner input = new Scanner(System.in);

                System.out.print("Enter score 1: ");
                int score1 = input.nextInt();

                    System.out.print("Enter score 2: ");
                    int score2 = input.nextInt();
                   
                    System.out.print("Enter score 3: ");
                      int score3 = input.nextInt();

                    int total = score1 + score2 + score3;
                    double average = total/3;
                        System.out.println("Total score:",total); 
                         System.out.printf ("Average score:%2f\n\n", average);

                    
                    
                






}

  }
