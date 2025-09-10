class Printer{
    void print(String a){
        System.out.println("string : "+a);
    }
    void print(int a){
        System.out.println("integer : "+a);
    }
    void print(double a){
        System.out.println("Double : "+a);
    }
}
public class Poly_load_2 {
    public static void main(String[] args) {
        Printer p1 = new Printer();
    
        p1.print(50);
        p1.print("shivam");
        p1.print(50.654);
    }
    
}
