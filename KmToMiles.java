import java.util.Scanner;
public class KmToMiles{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter distance in kilometers:");
double kilometers = input.nextDouble();
double constant = 0.621371;
double miles = kilometers * constant;
System.out.print(kilometers + miles);

}
   }
