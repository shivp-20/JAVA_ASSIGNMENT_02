class Calculator{
    public int multiply(int a, int b ){
        return a*b;
    }
    public double multiply(double a, double b ){
        return a*b;
    }
    public double multiply(int a, double b ){
        return a*b;
    }
    public double multiply(double a, int b ){
        return a*b;
    }

}
public class Poly_load_3 {
       public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(3, 4));         // int × int
        System.out.println(calc.multiply(2.5, 4.0));     // double × double
        System.out.println(calc.multiply(3, 2.5));       // int × double
        System.out.println(calc.multiply(2.5, 3));       // double × int
    }
    
    
}
