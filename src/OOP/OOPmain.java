package OOP;

public class OOPmain {
    public static void main(String[] args) {
        BankAccount object= new BankAccount();
        object.Deposit(5000);
        object.withdraw(2000);
        double balance=object.getBalance();
        System.out.println("your balance is "+balance);

    }
}
