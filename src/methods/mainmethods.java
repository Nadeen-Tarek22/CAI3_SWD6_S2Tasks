package methods;
// import (package name).*         هيجيب كل الكلاسيس

public class mainmethods {
    static int check=0;



    public static void main(String[] args) {
        staticMethod anything= new staticMethod();
        int num=4;
        int back=staticMethod.square(num);       //لما تكون ستاتيك وبحطها جوا ستاتيك
        // int back= anything.square(num);   //لما تكون non static وعايزة احطها جوا static
        System.out.println("The square of number "+num+" is " +back);
        anything(num);
        check++;
        // keyword for inheritance is 
    }

    public static int anything(int num){
        return num*num*num;

    }
}
