class Shape {
    void draw(){
        System.out.println(" For Any shape");
    }
     
    void draw(double radius){
           System.out.println("For Circle : "+radius);
    }
    void draw (double width, double height){
          System.out.println("For rectangle width : "+width+"& height : "+height);
    }
    void draw(int side1, int side2, int side3){
        System.out.println("For triangle "+side1+" "+side2+" "+ side3);
    }
}
public class Poly_load_4 {
    public static void main(String[] args) {
     Shape shape = new Shape();
     shape.draw(20.5);
     shape.draw(50.3, 40.50);
     shape.draw(10, 20, 30);
        
    }
}
