import java.util.Scanner;

class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) 
{
        this.balance = initialBalance;
    }

    public double getBalance() 
{
        return balance;
    }

    public void deposit(double amount) 
{
        if (amount > 0) 
{
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } 
else 
{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) 
{
        if (amount > 0 && amount <= balance) 
{
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } 
else 
{
            System.out.println("Sorry Insufficient balance\nPlease Check your Balance and Withdraw again .");
        }
    }
}

public class ATM 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Initial balance

        while (true) 
{
            System.out.println("\nATM Menu:");
            System.out.println("1.Check Balance\n2.Deposit\n3.withdraw\n4.Exit\nEnter your option:");
                        int choice = scanner.nextInt();

            switch (choice) 
{
                case 1:
                            System.out.println("Current Balance: " + account.getBalance());
                            break;
                case 2:
                           System.out.print("Enter deposit amount: ");
                           double depositAmount = scanner.nextDouble();
                          account.deposit(depositAmount);
                          break;
                case 3:
                         System.out.print("Enter withdrawal amount: ");
                         double withdrawAmount = scanner.nextDouble();
                         account.withdraw(withdrawAmount);
                         break;
                case 4:
                          System.out.println("Thank you for using the ATM. GOOD LUCK!");
                          scanner.close();
                          return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}