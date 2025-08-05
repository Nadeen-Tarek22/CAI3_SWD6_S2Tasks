package sessionToday;

public class FullTime extends baseClass{
    double bonus;
FullTime(String name, double baseSalary, double bonus){
   super(name, baseSalary);
    this.bonus=bonus;
}
    public void calcSalary(){
        System.out.println("the Employee name "+ getName() + " total salary is : "+(bonus+ baseSalary));
    }
}
