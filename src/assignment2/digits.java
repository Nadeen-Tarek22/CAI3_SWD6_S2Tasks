package assignment2;

import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter number to calculate the number of digits : ");
        int num= input.nextInt();
        int digits=0;
        while(num>0 && (num%10)>=0){
            num=num/10;
            digits++;
        }
        System.out.println("The numbebr of digits = "+ digits);
    }
}
//temp= num%10;
//