class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    //setter
    public void setAccountNumber(String accountNumber){
               this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    //getter
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
     public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}
public class Encap_1 {
    public static void main(String[] args) {
        BankAccount accnumber = new BankAccount("5498455", 10000);
        accnumber.displayAccountInfo();


        //modify the accnumber & balance
        accnumber.setAccountNumber("5498456");
        accnumber.setBalance(12000);


        //access updated number 
        System.out.println("Updated Acc number "+accnumber.getAccountNumber());
        System.out.println("Updated Balance "+accnumber.getBalance());
        
    }
    
}
