abstract class Vehicle{
    public abstract void start();
} 
class Car extends Vehicle{
     @Override
    public void start() {
        System.out.println("Car is starting");
    }
}
class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}
public class Abstract_1 {
    public static void main(String[] args) {
        Vehicle carVehicle = new Car();
        Vehicle bikeVehicle = new Bike();
        carVehicle.start();
        bikeVehicle.start();
    }
    
}
