import java.util.Scanner;
class atm_interface {
    double balance;
    atm_interface(double initialBalance) {
        this.balance = initialBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". New balance: ₹" + balance);
        }
    }
    void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}
class ATM {
    atm_interface account;
    Scanner scanner;
    ATM(atm_interface account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    void start() {
        while (true) {
            showMenu();
            System.out.print("Enter your choice (1-4): ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    account.checkBalance();
                    break;
                case "2":
                    Deposit();
                    break;
                case "3":
                    Withdraw();
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select from 1 to 4.");
            }
        }
    }
    void showMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
    void Deposit() {
        try {
            System.out.print("Enter amount to deposit: ");
            double amount = Double.parseDouble(scanner.nextLine());
            account.deposit(amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
        }
    }
    void Withdraw() {
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = Double.parseDouble(scanner.nextLine());
            account.withdraw(amount);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
        }
    }
}
class ATMInterface {
    public static void main(String[] args) {
        atm_interface userAccount = new atm_interface(5000);
        ATM atmMachine = new ATM(userAccount);
        atmMachine.start();
    }
}
