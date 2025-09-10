class Car{
    private String model;
    private int year;
    private int price;
    public Car(String model, int year,int price){
       this.model=model;
       this.year=year;
       this.price=price;
    }
    //setter
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        if(year>0){
            this.year=year;
        }
    }
    public void setPrice(int price){
        this.price=price;
    }
    //getter
    public String getModel(){
        return model;
    }
    public int getYear(){
        {
        return year;}
    }
    public int getPrice(){
        return price;
    }
    void Display(){
       System.out.println("Model : "+model);
       System.out.println("Year :"+year);
       System.out.println("Price : "+price);
    }
}
public class Encap_3 {
    public static void main(String[] args) {
        Car car = new Car("x15 ", 2003, 1500000);

        car.Display();

        car.setModel(" x20");
        car.setYear(2005);
        car.setPrice(200000);

        System.out.println("Udated model : "+car.getModel() );
        System.out.println("Udated year : "+car.getYear());
        System.out.println("Udated price : "+car.getPrice());
    }
    
}
