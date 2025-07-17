package OOP;

public class BankAccount {

        private double Balance;
       private double maxAmountOfDep= 15000;
       private double maxAmountOfWithdraw= 6000;


    public void Deposit(double amount){
        if(amount >maxAmountOfDep){
            System.out.println("you can not deposit more than 15000");
        }
        else if(amount<0){
            System.out.println("wrong data entry, you can not enter negative data");
        }
        else{
            Balance+=amount;
        }
    }


    public void withdraw(double amount){
        if(amount>maxAmountOfWithdraw || amount> Balance){
            System.out.println("wrong data entry");
        }
        else {
            Balance-=amount;
        }
    }
    public double getBalance(){
        return Balance;
    }
}
