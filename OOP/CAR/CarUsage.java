package OOP.CAR;

import OOP.DATE.MyDate;

public class CarUsage {
    public static void main(String[] args) {
        Car car = new Car("BMW", "E39", 1999, "4Y1SL65848Z411439", "black", "gasoline", 4, 400, 25, 330, "Akaki", 50,
                new MyDate(30, 1, 2025));


        car.displayDetails();

        System.out.println();

        System.out.println("Last service date: " + car.getLastServiceDate());
        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println();

        System.out.println("Fuel cost: " + car.calculateFuelCost(200, 3.50));
    }
}
