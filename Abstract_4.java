abstract class Employee{
    protected String name;
    protected int id;
    
    public Employee(String name, int id ){
         this.name=name;
         this.id=id;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class FullTimeEmployee extends Employee{
       private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee{
       private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
public class Abstract_4 {
    public static void main(String[] args) {
        Employee fullEmployee = new FullTimeEmployee("buddy",101,50000);
        Employee partEmployee = new PartTimeEmployee("om",102,40,250);
        
        fullEmployee.displayInfo();
        System.out.println(fullEmployee.calculateSalary());
        
        partEmployee.displayInfo();
        System.out.println(partEmployee.calculateSalary());
    }
     
}
