import java.util.Scanner;

public class Mobile {
    private String Name;
    private String Address;
    private int Age;
    private double Amount;

  
    public String getName() {
        return Name; 
    }
    public void setName(String name) {
        Name = name; 
    }

    public String getAddress() {
        return Address; 
    }
    public void setAddress(String address) {
        Address = address; 
    }

    public int getAge() {
        return Age; 
    }
    public void setAge(int age) {
        Age = age; 
    }

    public double getAmount() {
        return Amount; 
    }
    public void setAmount(double amount) {
        Amount = amount; 
    }

    public void Registration() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        setName(sc.nextLine());
        System.out.print("Please enter your address: ");
        setAddress(sc.nextLine());
        
        while (true) {
            System.out.print("Please enter your age: ");
            int eligibleAge = sc.nextInt();
            if (eligibleAge >= 18) {
                setAge(eligibleAge);
                break;
            } else {
                System.out.println("You are not eligible to open an account. Please try again.");
            }
        }

        while (true) {
            System.out.print("Please enter the initial deposit amount: ");
            double amountEntered = sc.nextDouble();
            if (amountEntered >= 500) {
                setAmount(amountEntered);
                break;
            } else {
                System.out.println("The account can only be activated with an amount of at least 500. Please deposit again.");
            }
        }
    }

    public void transfer() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter the amount to be transferred: ");
            double transferAmount = sc.nextDouble();
            if (getAmount() >= 5000) {
                if (transferAmount <= 1000) {
                   
                    sc.nextLine(); 
                    String transName = sc.nextLine();
                    setAmount(this.Amount - transferAmount);
                    System.out.println("Money has been transferred successfully to " + transName + ".");
                    System.out.println("Your new balance is: " + getAmount());
                    break; 
                } else {
                    System.out.println("You can only transfer a maximum of 1000 at a time. Please try again.");
                }
            } else {
                System.out.println("Your balance is too low for a transfer. The minimum balance required is 5000.");
                break; 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile mob = new Mobile();
        mob.Registration();

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("  1. Transfer money");
            System.out.println("  2. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mob.transfer();
                    break;
                case 2:
                    System.out.println("Exiting... Thank you for using our service!");
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}