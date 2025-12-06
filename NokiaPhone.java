import java.util.Scanner;

public class NokiaPhone {
    
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Phone book");
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
 

            switch (choice) {
                case 1 -> phoneBookMenu();
                case 2 -> messagesMenu();
                case 3 -> System.out.println("Chat opened.");
                case 4 -> callRegisterMenu();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }}

}

            
        }
    }
public static void main (String[]args){
System.out.print(phoneBookMenu);
        
            System.out.println("\n--- PHONE BOOK ---");
            System.out.println("1. Search");
            System.out.println("2. Service Nos.");
            System.out.println("3. Add name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
            System.out.println("7. Send b'card");
            System.out.println("8. Options");
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tags");
            System.out.println("11. Back");
            System.out.print("Choose: ");

 int choice = scanner.nextInt();
            if (choice == 11) return;

            switch (choice) {
                case 8 -> phoneBookOptions();
                default -> System.out.println("Function executed: " + choice);
            
        }
    }
public static void main(String[]args);
System.out.print(phoneBookOptions) {
        
            System.out.println("\n--- OPTIONS ---");
            System.out.println("1. Type of view");
            System.out.println("2. Memory status");
            System.out.println("3. Back");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            if (choice == 3) return;
            System.out.println("Option executed: " + choice);
        
    }
public static void main(String[]args){
System.out.print(messagesMenu);
        
            System.out.println("\n--- MESSAGES ---");
            System.out.println("1. Write messages");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
            System.out.println("4. Picture messages");
            System.out.println("5. Templates");
            System.out.println("6. Smileys");
            System.out.println("7. Message settings");
            System.out.println("8. Back");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            if (choice == 8) return;

            if (choice == 7) messageSettings();
            else System.out.println("Function executed: " + choice);
        
    }
public static void main(String[]args){
System.out.print(messageSettings);
        
            System.out.println("\n--- MESSAGE SETTINGS ---");
            System.out.println("1. Set 1");
            System.out.println("2. Common");
            System.out.println("3. Back");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            if (choice == 3) return;

            switch (choice) {
                case 1 -> {
                    System.out.println("1. Message centre number");
                    System.out.println("2. Messages sent as");
                    System.out.println("3. Message validity");
                }
                case 2 -> {
                    System.out.println("1. Delivery reports");
                    System.out.println("2. Reply via same centre");
                    System.out.println("3. Character support");
                }
                 System.out.println("Invalid");
            }
        }
    }

