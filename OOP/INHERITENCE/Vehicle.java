package OOP.INHERITENCE;

public class Vehicle {
    protected String brand = "ford";

    public void accelerate() {
        System.out.println("Pressing a gas pedal...");
        System.out.println("Car started to accelerate.");
    }

    public void brake() {
        System.out.println("Pressing a brake pedal...");
        System.out.println("Car stopped.");
    }

    public void honk() {
        System.out.println("Peep. Peep.");
    }
}
