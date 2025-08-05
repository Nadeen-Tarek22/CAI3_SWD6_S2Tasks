package productAssignment;

public class creditCardPayment implements payment{
    public int creditPayments=0;
    public void processPayment(){
        creditPayments++;
        System.out.println("credit card payment has been done successfully");
        System.out.println("number of payments are "+ creditPayments);



    }
    public void validateCard(){
        System.out.println("card is validated");
    }
}
