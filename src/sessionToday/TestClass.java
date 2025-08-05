package sessionToday;

public class TestClass {
    public static void main(String[] args) {
        baseClass[] employees= new baseClass[2];

        employees[0]= new FullTime("nadeen", 3000.0, 100.0);
        employees[1]= new PartTime("tarek", 20.0, 120);

        for( baseClass employee : employees){
            employee.calcSalary();
        }

    }
}
