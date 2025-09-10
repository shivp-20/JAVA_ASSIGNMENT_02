class Animal{
    void makesound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Bark");
    }
}
public class Inher_Animal{
    public static void main(String []args){
        Animal animalDog = new Dog();
        animalDog.makesound();
    }
}