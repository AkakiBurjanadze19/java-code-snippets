package OOP.INHERITENCE;

public class CarUsage {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("brand: " + car.brand);
        System.out.println("model name: " + car.getModelName());

        System.out.println();

        car.accelerate();
        car.brake();
        car.honk();
    }
}
