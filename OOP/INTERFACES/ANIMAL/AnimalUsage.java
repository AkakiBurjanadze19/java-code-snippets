package OOP.INTERFACES.ANIMAL;

public class AnimalUsage {
    public static void main(String[] args) {
        AnimalClass animal = new AnimalClass();
        Pig pig = new Pig();
        Dog dog = new Dog();

        animal.makeSound();
        animal.sleep();

        pig.makeSound();
        pig.sleep();

        dog.makeSound();
        dog.sleep();
    }
}
