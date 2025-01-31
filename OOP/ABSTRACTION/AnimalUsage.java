package OOP.ABSTRACTION;

public class AnimalUsage {
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();

        pig.makeSound();
        pig.sleep();

        dog.makeSound();
        dog.sleep();
    }
}
