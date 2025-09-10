class Vehicle{
    String brand="BMW";
    int speed=100;
  
    void Displaydetails(){
    System.out.println("Brand : "+ brand+" Speed : "+speed);
    }
}
class Car extends Vehicle{
    String fuelType = "petrol";

    @Override
    void Displaydetails(){
        System.out.println("Brand : "+ brand+" Speed : "+speed+" Fuel type : "+fuelType);
    }
}
public class Inher_Vehicle {

    public static void main(String[] args) {
        Vehicle vehicleCar = new Car();
        vehicleCar.Displaydetails();
    }
}