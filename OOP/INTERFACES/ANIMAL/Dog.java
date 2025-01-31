package OOP.INTERFACES.ANIMAL;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof! Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
