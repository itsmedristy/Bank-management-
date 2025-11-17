import java.util.ArrayList;
class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    public void showAllAccounts() {
        System.out.println("\n--- All Bank Accounts ---");
        for (BankAccount acc : accounts) {
            acc.showAccountInfo();
            System.out.println("----------------------");
        }
    }
}

