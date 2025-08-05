package sessionToday;

public class baseClass {
    String name;
    double baseSalary;

    baseClass(String name, double baseSalary) {
        this.name=name;
        this.baseSalary=baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void calcSalary(){
        System.out.println("Your base salary is : " +baseSalary);
    }
}
