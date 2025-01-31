package OOP.INTERFACES.ANIMAL;

public class AnimalClass implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
