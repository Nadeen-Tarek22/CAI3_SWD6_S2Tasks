package assignment2;

import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please Enter the number of students: ");
        int num = input.nextInt();
       //
        int student=1;
        int size=3;
        double []scores= new double[size];
        do{
            System.out.println("Enter student name: ");
            String gar= input.nextLine();
            String name= input.nextLine();
            System.out.println("Enter 3 Exam Scores: ");
            for(int i=0; i<=(size-1); i++){
                scores[i]= input.nextInt();
            }
            double studentAverage=Average(scores, size);
            char studentGrade= grade(studentAverage);
            System.out.println("The student's name is : "+ name);
            System.out.println("The average score is : "+ studentAverage);
            System.out.println("The student's grade is : "+ studentGrade);
        student++;


        }while (student<=num);

    }

    public static double Average(double[] arr, int size){
        double sum=0;
        for(int i=0; i<=(size-1); i++){
            sum= sum+arr[i];
        }
        return (sum/size);
    }

    public static char grade(double average){
        if (average>=85){
            return 'A';
        }
        else if (average>=70 && average<=84){
            return 'B';
        }
        else if (average>=50 && average<=69) {
            return 'C';
        }
        else {
            return 'F';
        }
    }




}
