import java.util.Scanner;

public class Sentence {
    public static void main(String[] args){
        System.out.println("please Enter a sentence: ");
        Scanner Sentence= new Scanner(System.in);
        String word= Sentence.nextLine();
        int len= word.length();
        char first= word.charAt(0);
        String upperWord= word.toUpperCase();
        System.out.println("Uppercase : " +upperWord);
        System.out.println("Length: "+ len);
        System.out.println("First Character: "+ first);




    }
}
