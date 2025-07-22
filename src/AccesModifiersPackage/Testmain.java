package AccesModifiersPackage;

public class Testmain {
    public static void main(String[] args) {
        person object1= new person();
       // object1.name;
        person.age=20;
        person.gender="female";
        person.salary=2000;
        object1.displayinfo();
    }
}
