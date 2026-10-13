import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueManager manager = new QueueManager();
        int choice;

        System.out.println("=== Welcome to DigiQueue System ===");

        do {
            System.out.println("\n1. Add Customer (Generate Ticket)");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Display Current Queue");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    manager.addCustomer(name);
                    break;
                case 2:
                    manager.serveNext();
                    break;
                case 3:
                    manager.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting DigiQueue. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}