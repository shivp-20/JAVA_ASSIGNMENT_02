class Person{
    public String name;
    public int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    } 
}
class Student extends Person{
    int rollNumber;
    int marks;
    public Student(String name, int age,int rollNumber,int marks){
        super(name,age);
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age : "+age);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Marks : "+marks);
    }

}
public class Inher_Person {
    public static void main(String[] args) {
        Student student1 = new Student("Maxwell", 25, 010, 400);
        student1.display();
    }
    
}
