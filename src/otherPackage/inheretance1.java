package otherPackage;
import AccesModifiersPackage.*;
public class inheretance1 extends person {
    public static void main(String[] args) {


        person object2 = new person();
       // person.name;
       // person.age = 20;
        person.gender = "female";
        person.salary = 2000;
        object2.displayinfo();
    }
}