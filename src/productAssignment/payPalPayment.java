package productAssignment;

public class payPalPayment implements payment{
    public int payPalPayments=0;
    public void processPayment(){
        payPalPayments++;
        System.out.println("pay pal payments are "+ payPalPayments);

    }
    public void validateCard(){
        System.out.println("pay pal card is validated");
    }
}
