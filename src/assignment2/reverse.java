package assignment2;

import java.util.Scanner;

/*public class reverse {
  /*  public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter number to calculate the number of digits : ");
        int num= input.nextInt();
        int num2 = num;
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
                arrRev[i]=(num2%10);

            }
            counter++;
        }
        System.out.println("The number of digits = "+ digit);
        for(int i=(size-1); i>=0; i--){

            System.out.println("The reversed number is : " +arrRev[i]);
        }
    }
}
/////////////////////////////////////////////////


Scanner input=new Scanner(System.in);
            System.out.println("Please Enter number to calculate the number of digits : ");
int num= input.nextInt(); //1234
int num2 = num; //1234
int digit=0;



            while(num>0 && (num%10)>=0){

num=num/10;//123//12//1//0
digit++;//1//2//3//4
        }
int size=digit;//4
int[] arrRev= new int[size];//4
int counter=1;


                for(int i=0; i<=(size-1); i++){
arrRev[i]=(num2%10);
num2=num2/10;

        }
        for (int revresedNumber : arrRev) {
        System.out.println("The reversed number is : " +revresedNumber);
                }


//123--//12--//1--//0
counter++;//2--//3--//4
/*

            System.out.println("The number of digits = "+ digit);
            for(int i=(size-1); i>=0; i--){

                System.out.println("The reversed number is : " +arrRev[i]);
            }
*/


