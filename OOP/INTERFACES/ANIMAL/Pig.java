package OOP.INTERFACES.ANIMAL;

public class Pig implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The pig says: Wee! Wee!");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
