package constructor_assignment;

public class mainStudent {
    public static void main(String[] args) {
        student object1= new student("Tarek", 20, 3.50 );
        student object2=new student("nadeen", 20, 2.75);
        object1.displayInfo();
        object1.study(3.50);
        object2.displayInfo();
        object2.study(2.75);
    }
}
