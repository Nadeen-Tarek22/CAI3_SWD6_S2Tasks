package productAssignment;

public class assignmentMain {
    public static void main(String[] args) {
        customer object1=new customer(1, "Mohammed", "mohameed229@gmail.com");
        admin admin1= new admin(1, "admin1", "admin112@hmail.com");
        object1.getUserInfo();
        object1.placeOrder(1);
        admin1.getUserInfo();
        admin1.updateProduct();
        payPalPayment payment1=new payPalPayment();
        payment1.processPayment();
        creditCardPayment credit1=new creditCardPayment();
        credit1.validateCard();

    }
}
