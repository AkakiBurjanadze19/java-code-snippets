package OOP.POLYMORPHISM;

public class AnimalUsage {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();

        animal.makeSound();
        pig.makeSound();
        dog.makeSound();
    }
}
