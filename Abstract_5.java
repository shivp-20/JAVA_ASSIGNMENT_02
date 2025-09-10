abstract class Appliance{
    public abstract void turnOn();
    public abstract void turnOff();
}
class Fan extends Appliance{
    public void turnOn(){
        System.out.println("Turn on fan");
    }
    public void turnOff(){
        System.out.println("Turn off fan");
    }
}
class Light extends Appliance{
    public void turnOn(){
        System.out.println("Turn on light");
    }
    public void turnOff(){
        System.out.println("Turn off light");
    }
}
public class Abstract_5 {
    public static void main(String[] args) {
        Appliance fAppliance = new Fan();
        Appliance lAppliance = new Light();

        fAppliance.turnOn();
        fAppliance.turnOff();

        lAppliance.turnOn();
        lAppliance.turnOff();

    }
    
}
