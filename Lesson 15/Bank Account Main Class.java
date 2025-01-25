public class BankAccount 
{
    String name;
    double balance;

    public BankAccount(String accountHolderName, double initialBalance) 
    {
        Balance = initialBalance;
        Name = accountHolderName;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public void withdraw(double amount) 
    {
        balance -= amount;
    }
    
    double Balance;
    String Name;
}
