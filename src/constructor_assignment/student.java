package constructor_assignment;

public class student {
    private String name;
    private int age;
    private double gpa;


    student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }

    public void displayInfo(){
        System.out.println("name is : "+name);
        System.out.println("age is : " +age);
        System.out.println("gpa is : " +gpa);
    }

    public void study(double gpa){
        if(gpa>3){
            System.out.println("The student studies AI");

        }
        else if(gpa<3 && gpa>2){
            System.out.println("The student studies CS and IS");
        }
        else {
            System.out.println("The student studies IT");
        }



    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }
}
