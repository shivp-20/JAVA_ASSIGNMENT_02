class Employee{
    String name;
    int salary;

    public Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}
class Manager extends Employee{
    int bonus;
    public Manager(String name,int salary,int bonus){
        super(name, salary);
        this.bonus=bonus;
    }
    public int Totalsalary(){
             return salary+bonus;
    }
     void display(){
        System.out.println("Name : "+name+" Base salary : "+salary+" Bonus : "+bonus+" total salary: "+ Totalsalary());
    }

}
public class Inher_Employee {
    public static void main(String[] args) {
        Manager manager = new Manager("omkar", 50000, 10000);
        manager.display();
    }
    
}
