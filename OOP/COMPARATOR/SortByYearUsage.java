package OOP.COMPARATOR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByYearUsage {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        SortByYear myComparator = new SortByYear();

        Car car1 = new Car("BMW", "E39", 2021);
        Car car2 = new Car("MERCEDES", "E200", 2005);
        Car car3 = new Car("AUDI", "A8", 2018);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Collections.sort(cars, myComparator);

        for (Car car : cars) {
            System.out.println("---car details---");
            System.out.println("brand: " + car.getBrand());
            System.out.println("model: " + car.getModel());
            System.out.println("year: " + car.getYear());
            System.out.println("---car details---");
        }
    }
}
