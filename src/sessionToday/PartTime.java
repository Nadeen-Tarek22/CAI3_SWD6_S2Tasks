package sessionToday;

public class PartTime extends baseClass{
    double hourlyPay;
    double workingHours;
    PartTime(String name, double hourlyPay, double workingHours){
        super(name, 0);
        this.hourlyPay=hourlyPay;
        this.workingHours=workingHours;

    }
    @Override
    public void calcSalary(){
        System.out.println("Employee name is: " + getName() +"Your salary is : " +(hourlyPay * workingHours));
    }
}
