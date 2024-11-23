import java.util.Scanner;

public class Bank {
    private double balance;
    private double withdrawalAmount;
    private String dayWeek;
    private String amount;

    // Setter for balance with user input
    public void setBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance:");
        this.balance = sc.nextDouble();
        sc.nextLine(); // Consume newline after double input
    }

    // Setter for withdrawal amount with user input
    public void setWithdrawalAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount:");
        this.withdrawalAmount = sc.nextDouble();
        sc.nextLine();
        if (withdrawalAmount <= balance) {
            if (dayWeek.equalsIgnoreCase("Monday")) {
                System.out.println("Withdrawing amount: " + withdrawalAmount);
                balance -= withdrawalAmount;
                System.out.println("New balance: " + balance);
                System.out.println("Withdrawal succeeded.");
            } else {
                System.out.println("Withdrawals can only be made on Monday.");
            }
        } else {
            System.out.println("Insufficient balance.");
        }
     
        // Consume newline after double input
    }

    // Setter for day of the week with user input
    public void setDayWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        this.dayWeek = sc.nextLine();
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public void requestLoan() {
        System.out.println("enter Loan Amount");
        Scanner sc = new Scanner(System.in);
        double loanAmount = sc.nextDouble();

        if (balance > 50000) { // Ensure balance is greater than 50,000 to qualify for loan
            double maxLoanAmount = 10 * balance; // Max loan is 10 times  balance
            if (loanAmount <= maxLoanAmount) {   // Compare loanAmount to the max possible loan
                System.out.println("Loan of " + loanAmount + " granted.");
            } else {
                System.out.println("Requested loan exceeds 10 times your current balance.");
            }
        } else {
            System.out.println("Your balance is too low to request a loan.");
        }
    }
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Use setters to input balance, withdrawal amount, and day of the week
        bank.setBalance();
        bank.setDayWeek();
        bank.setWithdrawalAmount();
        bank.requestLoan();
       

        // Attempt to withdraw the amount
       
    }
}
