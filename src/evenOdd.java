import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Please Enter a number: ");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
