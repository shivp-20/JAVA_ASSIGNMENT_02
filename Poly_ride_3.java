class Bank{
    void getInterestRate(){
        System.out.println("Random bank interestrate.");
    }
}
class SBI extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("SBI bank interestrate.");
    }
}
class HDFC extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("HDFC bank interestrate.");
    }
}
class ICICI extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("ICICI bank interestrate.");
    }
}
public class Poly_ride_3 {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        Bank hdfcBank = new HDFC();
        Bank iciciBank = new ICICI();

        sbiBank.getInterestRate();
        hdfcBank.getInterestRate();
        iciciBank.getInterestRate();
    }
    
}
