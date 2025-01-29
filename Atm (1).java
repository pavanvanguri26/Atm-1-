import java.util.Scanner;

public class Atm{
    private static double balance = 1000.00; 
    private static int pin = 1234; 
    private static int enteredPin;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your PIN: ");
        enteredPin = scanner.nextInt();
        
        if (enteredPin == pin) {
            System.out.println("PIN correct! Welcome to the ATM.");
            while (true) {
                
                System.out.println("\nATM Menu:");
                System.out.println("1. Balance Enquiry");
                System.out.println("2. Cash Withdrawal");
                System.out.println("3. Change PIN");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        balanceEnquiry();
                        break;
                    case 2:
                        cashWithdrawal(scanner);
                        break;
                    case 3:
                        changePin(scanner);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM! Goodbye.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }

    // Balance Enquiry
    private static void balanceEnquiry() {
        System.out.println("Your current balance is: " + balance);
    }

    // Cash Withdrawal
    private static void cashWithdrawal(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        if (amount > balance) {
            System.out.println("Insufficient funds! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        }
    }

    // Change PIN
    private static void changePin(Scanner scanner) {
        System.out.print("Enter your current PIN: ");
        int currentPin = scanner.nextInt();
        
        if (currentPin == pin) {
            System.out.print("Enter your new PIN: ");
            pin = scanner.nextInt();
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect current PIN. Change failed.");
        }
    }
}



    
    
