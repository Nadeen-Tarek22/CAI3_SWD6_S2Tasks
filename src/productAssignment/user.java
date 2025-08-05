package productAssignment;

import java.sql.SQLOutput;

public class user {
    public int userID;
    public String userName;
    public String userEmail;

    public user(int userID, String userName, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void getUserInfo(){
        System.out.println("user name : "+ userName);
        System.out.println("user ID "+userID);
        System.out.println("use Email is " + userEmail);
    }

}
