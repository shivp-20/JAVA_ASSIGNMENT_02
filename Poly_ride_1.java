class Animal{
    void speak(){
        System.out.println("Any Animal speak");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meoww");
    }
}
public class Poly_ride_1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();
        cat.speak();
    }
    
}
