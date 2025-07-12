import java.util.Scanner;

public class session {
    public static void main(String[] args) {
      /*  Scanner input=new Scanner(System.in);
        System.out.println("please enter a character grade from (A, B, C, D, F)");
        String stt= input.nextLine();
        char grade=stt.charAt(0);
        char x  = 'a';
        switch(grade){
            case 'A':
                System.out.println("A is Excellent ");
             break;

            case 'B':
                System.out.println("B is Very good ");
                break;

            case 'C':
                System.out.println("C is good");
                break;

            case 'D':
                System.out.println("D is pass");
            break;

            case 'F':
                System.out.println("F is failed");
                break;

            default:
                System.out.println("invalid character");
                break;

        }
        for(int i=1; i<=10; i++){
            int num=6;
            System.out.println(i*num);
             for(int j=1; j<=10; j++){
                 System.out.println(i*(num++));
             }
        }
*/

    for(int i=1; i<=10; i++){
        System.out.println("This is the multiplication table for the number " +i);
       for(int j=1; j<=10; j++){

           System.out.print(i*j);
       }
        System.out.println("***********");

    }
}
}
        
