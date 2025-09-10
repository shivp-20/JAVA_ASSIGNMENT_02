class Shape{
   public double area(){
        return 0;
    }
}
class Circle extends Shape{
     private double radius;

     public Circle(double radius){
        this.radius=radius;
     }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double area(){
        return width*height;
    }
}
public class Inher_Area {
    public static void main(String[] args) {
         Shape circle = new Circle(2.5);
         Shape rectangle = new Rectangle(5.55, 6.50);

         System.out.println("Area of circle : "+circle.area());
         

         System.out.println("Area of Rectangle : "+rectangle.area());
         
    }
    
}
