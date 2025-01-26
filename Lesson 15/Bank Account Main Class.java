public class BankAccount 
{
    public BankAccount(String accountHolderName, double initialBalance) 
    {
        Balance = initialBalance;
        Name = accountHolderName;
    }

    public void deposit(double amount) 
    {
        Balance += amount;
    }

    public void withdraw(double amount) 
    {
        Balance -= amount;
    }
    
    double Balance;
    String Name;
}
