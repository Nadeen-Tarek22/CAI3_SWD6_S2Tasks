import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Hello, please Enter 2 numbers: ");
        Scanner input= new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        int sum= num1+num2;
        int dif= num1-num2;
        int multi= num1*num2;
        int div=0;
        boolean correct= false;
      if(num2>0) {
          div = num1 / num2;
          correct =true;
      }
        System.out.println("The sum = " +sum);
        System.out.println("The Difference = " +dif);
        System.out.println("The Product = " +multi);
      if(correct) {
          System.out.println("The sum = " + div);
      }
      else{
          System.out.println("Division can not be done due to an error ");
      }


    }
}
