class MathOperations {
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return (a+b+c);
    }
    double add(double a, double b){
        return a+b;
    }
}
public class Poly_load_1 {
    public static void main(String[] args) {
        MathOperations op1= new MathOperations();
        
          System.out.println("For two integers : "+op1.add(10,20));
          System.out.println("For three integers : "+op1.add(40, 80, 1));
          System.out.println("For two double : "+op1.add(20.5, 40.69));
    }
    
}
