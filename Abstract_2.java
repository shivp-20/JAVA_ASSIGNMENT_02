abstract class Shape{
    public abstract void calculateArea();
}

class Circle extends Shape {
      @Override
      public void calculateArea(){
        System.out.println("it is calculate area of circle");
      }
}
class Rectangle extends Shape {
      @Override
      public void calculateArea(){
        System.out.println("it is calculate area of rectangle");
      }
}
public class Abstract_2 {
    public static void main(String[] args) {
        Shape circShape = new Circle();
        Shape rectShape = new Rectangle();

        circShape.calculateArea();
        rectShape.calculateArea();
    }
    
}
