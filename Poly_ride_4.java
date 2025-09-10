class Phone{
    void call(){
        System.out.println("It is normal call");
    }
}
class Smartphone extends Phone{
    @Override
    void call(){
        System.out.println("It is smartphone call");
    }
}
class Landline extends Phone{
    @Override
    void call(){
        System.out.println("It is landline call");
    }
}
public class Poly_ride_4 {
    public static void main(String[] args) {
        Phone smPhone = new Smartphone();
        Phone lPhone = new Landline();

        smPhone.call();
        lPhone.call();
    }

     
}