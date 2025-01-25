import java.util.Scanner;
class Tester 
{
    public static void main(String args[]) 
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.printf("Enter the name to whom the account belongs: "); 
        String name = kbReader.nextLine();

        System.out.print("Enter the amount of the deposit: "); 
        double amount = kbReader.nextDouble();

        BankAccount myAccount = new BankAccount(name, amount);

        myAccount.deposit(505.22);
        
        myAccount.withdraw(100.00);

        System.out.printf("The " +  myAccount.name + " account balance is, " + myAccount.balance);
    }
}