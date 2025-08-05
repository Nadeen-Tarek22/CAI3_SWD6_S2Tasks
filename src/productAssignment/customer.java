package productAssignment;

public class customer extends user{
    public customer(int userID, String userName, String userEmail) {
        super(userID, userName, userEmail);
    }

    public void placeOrder(int productID){
        System.out.println("an order has been placed");

    }
    public void placeOrder(int productID, int quantity){
        System.out.println("an order has been placed");
    }
@Override
    public void getUserInfo(){
        System.out.println("Customer name : "+ userName);
        System.out.println("Customer ID "+userID);
        System.out.println("customer Email is " + userEmail);
    }
}
