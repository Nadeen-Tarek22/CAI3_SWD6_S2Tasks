package assignment2;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter number to calculate the number of digits : ");
        int num= input.nextInt();
        int digit=0;


        int counter=1;
        while(num>0 && (num%10)>=0){

            num=num/10;
            digit++;
        }
        int size=digit;
        int[] arrRev= new int[size];
        while(counter<=digit){
            for(int i=0; i<=(size-1); i++){
                arrRev[i]=(num%10);
            }
        }
        System.out.println("The numbebr of digits = "+ digit);
        for(int nums : arrRev){
            System.out.print("The reversed number is : " + nums);
        }
    }
}
