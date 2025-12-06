import java.util.Scanner;

public class NokiaPhone {
    
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);


        
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
public static void main(String[]args){
System.out.print(phoneBookOptions);
        
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

            int choice = scanner.nextInt();
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
public static void main(String[]args){
System.out.print(callRegisterMenu);
        
            System.out.println("\n--- CALL REGISTER ---");
            System.out.println("1. Missed calls");
            System.out.println("2. Received calls");
            System.out.println("3. Dialled numbers");
            System.out.println("4. Erase recent call lists");
            System.out.println("5. Show call duration");
            System.out.println("6. Show call costs");
            System.out.println("7. Call cost settings");
            System.out.println("8. Prepaid credit");
            System.out.println("9. Back");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            if (choice == 9) return;

            switch (choice) {
                case 5 -> callDurationMenu();
                case 6 -> callCostMenu();
                case 7 -> callCostSettingsMenu();
                default -> System.out.println("Function executed: " + choice);
            }
        }
    }

public static void main(String[]args){
System.out.print(callDurationMenu);
        System.out.println("\n--- CALL DURATION ---");
        System.out.println("1. Last call duration");
        System.out.println("2. All calls' duration");
        System.out.println("3. Received calls' duration");
        System.out.println("4. Dialled calls' duration");
        System.out.println("5. Clear timers");
    }

public static void main(String[])args{
System.out.print(callCostMenu);
        System.out.println("\n--- CALL COSTS ---");
        System.out.println("1. Last call cost");
        System.out.println("2. All calls' cost");
        System.out.println("3. Clear counters");
    }

public static void main(String][]args){
System.out.print(callCostSettingsMenu);
        System.out.println("\n--- CALL COST SETTINGS ---");
        System.out.println("1. Call cost limit");
        System.out.println("2. Show costs in");
    }
}


public static void main(String[] args) {
        
        boolean running = true;
        
        while (running) {
            displayMainMenu();
            System.out.print("Enter your choice (5-13, or 0 to Exit): ");
            
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 5:
                        handleTones();
                        break;
                    case 6:
                        handleSettings();
                        break;
                    case 7:
                        System.out.println("7. Call divert selected. Divert calls to another number.");
                        break;
                    case 8:
                        handleUtilitiesMenu("Games, Calculator, Stopwatch, Countdown timer");
                        break;
                    case 9:
                        handleUtilitiesMenu("Calculator");
                        break;
                    case 10:
                        handleUtilitiesMenu("Stopwatch");
                        break;
                    case 11:
                        handleClock();
                        break;
                    case 12:
                        System.out.println("12. Profiles selected. Change phone profile (General, Silent, etc.).");
                        break;
                    case 13:
                        System.out.println("13. SIM services selected. Options depend on your SIM card.");
                        break;
                    case 0:
                        System.out.println("Exiting Phone Menu Simulator. Goodbye!");
                        running = false;
                        break;
                    
                        System.out.println("Invalid choice. Please enter a number between 5 and 13, or 0 to Exit.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                
            }
            
            if (running) {
                System.out.println("--- Press Enter to continue ---");
                scanner.nextLine(); // Consume the newline left by nextInt()
                scanner.nextLine(); // Wait for user to press Enter
            }
        }
        scanner.close();
    }

    public static void main(String[]args){
System.out.print(MainMenu);
        System.out.println("\n--- MAIN MENU (Part 2) ---");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminders");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
        System.out.println("0. Exit");
        System.out.println("--------------------------");
    }

    public static void main(String[]args){
System.out.print(handleTone);
        System.out.println("\n--- 5. Tones Sub-Menu ---");
        System.out.println("1. Ringing tone");
        System.out.println("2. Ringing volume");
        System.out.println("3. Incoming call alert");
        System.out.println("... (and 6 other options)");
        System.out.println("-------------------------");
    }

    public static void main(String[]args){
Sysstem.out.pprint(handleSettings);
        System.out.println("\n--- 6. Settings Sub-Menu ---");
        System.out.println("1. Call settings (Automatic redial, Speed dialling, etc.)");
        System.out.println("2. Phone settings (Language, Cell info display, etc.)");
        System.out.println("3. Security settings (PIN code request, Call barring service, etc.)");
        System.out.println("4. Restore factory settings");
        System.out.println("----------------------------");
    }

    public static void main(String[]args){
System.out.print(handleClock);
        System.out.println("\n--- 11. Clock Sub-Menu ---");
        System.out.println("1. Alarm clock");
        System.out.println("2. Clock settings");
        System.out.println("3. Date setting");
        System.out.println("4. Stopwatch");
        System.out.println("5. Countdown timer");
        System.out.println("6. Auto update of date and time");
        System.out.println("--------------------------");
    }

    public static void main(String[]args){
System.out.print(handleUtilitiesMenu);
        System.out.println("\n--- Selected Menu Option ---");
        System.out.println("You selected " + item + ". Starting utility application...");
        System.out.println("----------------------------");
    }
}
