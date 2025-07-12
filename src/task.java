import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        int numTry=1;
        int maxtry=3;
        boolean check= false;
        Scanner input= new Scanner(System.in);
        System.out.println("please Enter your password, you have only 3 times");
        String password="NadeenT2";
    do{
        String pass= input.nextLine();
        if(pass.equals(password)){
            System.out.println("password is correct");
            check=true;
            break;
        }
        else {
            System.out.println("Invalid password, Try again");
        }

        numTry++;
    }while(numTry<=maxtry);
    if(!check){
        System.out.println("you have finished you number of tries");
    }
    }
}
