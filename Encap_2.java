class Student{
    private String name;
    private double marks;
    //constructor
    public Student(String name, double marks){
      this.name=name;
      this.marks=marks;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
    //getter
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }
    public void Display(){
        System.out.println("Name : "+name);
        System.out.println("Marks : "+marks);
    }
}
public class Encap_2 {
    public static void main(String[] args){
        Student std = new Student(" shivam ", 450.30);

        std.Display();

        std.setName(" omkar ");
        std.setMarks(550.30);

        System.out.println("Updated Name : "+std.getName());
        System.out.println("Updated Marks : "+std.getMarks());
    }
    
}
