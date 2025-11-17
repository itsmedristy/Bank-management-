import java.util.Scanner;
public class AdvancedBankProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Calculate Compound Interest");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNumber = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();
                    bank.addAccount(new BankAccount(name, accNumber, initialBalance));
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String depAcc = sc.next();
                    BankAccount depAccount = bank.findAccount(depAcc);
                    if (depAccount != null) {
                        System.out.print("Enter deposit amount: ");
                        double dep = sc.nextDouble();
                        depAccount.deposit(dep);
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String witAcc = sc.next();
                    BankAccount witAccount = bank.findAccount(witAcc);
                    if (witAccount != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double wit = sc.nextDouble();
                        witAccount.withdraw(wit);
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String checkAcc = sc.next();
                    BankAccount checkAccount = bank.findAccount(checkAcc);
                    if (checkAccount != null) {
                        checkAccount.checkBalance();
                    }
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    String intAcc = sc.next();
                    BankAccount intAccount = bank.findAccount(intAcc);
                    if (intAccount != null) {
                        System.out.print("Enter interest rate (%): ");
                        double rate = sc.nextDouble();
                        System.out.print("Enter number of years: ");
                        int years = sc.nextInt();
                        intAccount.calculateCompoundInterest(rate, years);
                    }
                    break;

                case 6:
                    bank.showAllAccounts();
                    break;

                case 7:
                    exit = true;
                    System.out.println("Thank you for using the bank system!");
                    break;

     
           default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
