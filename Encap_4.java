class Laptop{
    private String brand;
    private int price;
    //constructor
    public Laptop(String brand, int price){
        this.brand=brand;
        this.price=price;
    }
    //setter
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setPrice(int price){
        if(price>0){
        this.price=price;
    }
    }
    //getter 
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    void Display(){
        System.out.println("Brand : "+ brand);
        System.out.println("Price : "+ price);
    }
}
public class Encap_4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(" HP ", 50000);
        //display old details
        laptop.Display();

        //access
        laptop.setBrand(" DELL ");
        laptop.setPrice(75000);

        //updated details
        System.out.println("Updated Brand : "+ laptop.getBrand());
        System.out.println("Updated Price : "+ laptop.getPrice());


    }
    
}
