import java.util.Scanner;

public class votingEligibility {
    public static void main(String[] args) {
        System.out.println("please Enter you Nationality then your Age: ");
        Scanner input= new Scanner(System.in);
        String nation= input.nextLine();
        int age= input.nextInt();
        if(age>17){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible");
        }



    }
}