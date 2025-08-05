package productAssignment;

public class admin extends user{
    public admin(int userID, String userName, String userEmail) {
        super(userID, userName, userEmail);
    }

    public void updateProduct(){
        System.out.println("product has been updated");
    }

    @Override
    public void getUserInfo(){
        System.out.println("Admin name : "+ userName);
        System.out.println("Admin ID "+userID);
        System.out.println("Admin Email is " + userEmail);
    }
}
