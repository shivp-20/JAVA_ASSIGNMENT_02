abstract class  Payment {
      public abstract void payAmount(double amount);
    
}
class CreditCardPayment extends Payment{
    @Override
    public void payAmount(double amount){
        System.out.println(amount + " Payment done by credit card ");
    }
}
class UPIPayment extends Payment{
    @Override
    public void payAmount(double amount){
        System.out.println(amount+" Payment done by UPI card ");
    }
}
public class Abstract_3 {
    public static void main(String[] args) {
        Payment credPayment = new CreditCardPayment();
        Payment upiPayment = new UPIPayment();

        credPayment.payAmount(1500.30);
        upiPayment.payAmount(5872.30);
    }
}
