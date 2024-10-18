public class Bank {

    private double amount; // Instance variable to store account balance

    // Parameterized constructor to initialize amount
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw money (using ternary operator)
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > amount) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            amount -= withdrawalAmount;
            System.out.println("Successfully withdrawn: ₹" + withdrawalAmount);
        }
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposited: ₹" + depositAmount);
    }

    // Method to display total balance
    public void displayBalance() {
        System.out.println("Total Balance: ₹" + amount);
    }

    public static void main(String[] args) {

//        Bank account with initial amount of ₹10000
        Bank account = new Bank(10000);

        // Withdraw ₹2000 (successful)
        account.withdraw(2000);

        // Deposit ₹5000
        account.deposit(5000);

        // Display final balance
        account.displayBalance();
    }
}