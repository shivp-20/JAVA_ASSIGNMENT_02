class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle{
    @Override
    void run(){
        System.out.println("Car is running");
    }
}
class Bike extends Vehicle{
    @Override
    void run(){
        System.out.println("Bike is running");
    }
}
public class Poly_ride_2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        
        car.run();
        bike.run();
    }
}
