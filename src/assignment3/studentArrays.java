package assignment3;

import java.util.Scanner;

public class studentArrays {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int size=5;
        int[] marks= new int[size];
        int num=1;
        int pass=0;
        int fail=0;
        System.out.println("please Enter number of Students: ");
        int students= input.nextInt();
        while(num<=students){
            System.out.println("Please Enter 5 marks :");
            for(int i=0; i<size; i++){
                marks[i]=input.nextInt();
            }
            int avr=Average(marks, size);
            System.out.println("The average mark for the student number "+ num + " is : "+ avr);
            HighLow(marks, size);
            for(int i=0; i<size; i++){
                System.out.println("The mark number "+ i +" is "+ marks[i]);
            }
            if(avr>=50){
                pass++;
            }
            else{
                fail++;
            }

            num++;
        }
        System.out.println("The number of students passed is " +pass+ " and the number of students failed is "+fail );
    }
    public static int Average(int[] arr, int size){
        int sum=0;
        for(int i=0; i<=(size-1); i++){
            sum= sum+arr[i];
        }
        return (sum/size);
    }
    public static void HighLow(int[] arr, int size){
        int High=arr[0];
        int Low=arr[0];
        for(int i=1; i<=(size-1); i++){
            if(arr[i]>High){
                High=arr[i];
            }
            else if(arr[i]<Low){
                Low=arr[i];
            }
        }
        System.out.println("The highest mark is : "+ High);
        System.out.println("The lowest mark is : "+Low);
    }




}
