package AccesModifiersPackage;

public class person {
    private static String name;
    static int age;
    protected static String gender;
    public static int salary;

    public void displayinfo(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("gender is "+ gender);
        System.out.println("salary is "+ salary);

    }

}
