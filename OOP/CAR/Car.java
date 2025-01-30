package OOP.CAR;

import OOP.DATE.MyDate;

public class Car {
    private String make;
    private String model;
    private int year;
    private String vin;
    private String color;
    private String engineType;
    private int numberOfDoors;
    private int horsePower;
    private double mpg;
    private int topSpeed;
    private String owner;
    private double mileage;
    private MyDate lastServiceDate;

    public Car(String make, String model, int year, String vin, String color, String engineType, int numberOfDoors,
               int horsePower, double mpg, int topSpeed, String owner, double mileage, MyDate lastServiceDate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.engineType = engineType;
        this.numberOfDoors = numberOfDoors;
        this.horsePower = horsePower;
        this.mpg = mpg;
        this.topSpeed = topSpeed;
        this.owner = owner;
        this.mileage = mileage;
        this.lastServiceDate = lastServiceDate;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if (make == null) {
            throw new NullPointerException("make cannot be null!");
        }

        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new NullPointerException("model cannot be empty!");
        }

        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 0 || year > 2025) {
            throw new IllegalStateException("invalid year!");
        }

        this.year = year;
    }

    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        if (vin == null) {
            throw new NullPointerException("vin cannot be empty!");
        }

        this.vin = vin;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new NullPointerException("color cannot be empty!");
        }

        this.color = color;
    }

    public String getEngineType() {
        return this.engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType == null) {
            throw new NullPointerException("engineType cannot be empty!");
        }

        this.engineType = engineType;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberofDoors(int numberOfDoors) {
        if (numberOfDoors < 1 || numberOfDoors > 4) {
            throw new IllegalStateException("invalid number of doors!");
        }

        this.numberOfDoors = numberOfDoors;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower < 0) {
            throw new IllegalStateException("invalid horse power!");
        }

        this.horsePower = horsePower;
    }

    public double getMpg() {
        return this.mpg;
    }

    public void setMpg(double mpg) {
        if (mpg < 0) {
            throw new IllegalArgumentException("invalid mpg!");
        }

        this.mpg = mpg;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed < 0) {
            throw new IllegalStateException("invalid top speed!");
        }

        this.topSpeed = topSpeed;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        if (owner == null) {
            throw new NullPointerException("owner cannot be empty!");
        }

        this.owner = owner;
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalStateException("mileage cannot be negative!");
        }

        this.mileage = mileage;
    }

    public MyDate getLastServiceDate() {
        return this.lastServiceDate;
    }

    public void setLastServiceDate(MyDate lastServiceDate) {
        if (lastServiceDate == null) {
            throw new NullPointerException("lastServiceDate cannot be null!");
        }

        this.lastServiceDate = lastServiceDate;
    }

    public void startEngine() {
        System.out.println("Starting an engine...");
        System.out.println("Engine is ready.");
    }

    public void accelerate() {
        System.out.println("Pressing a gas pedal...");
        System.out.println("Started to accelerate.");
    }

    public void brake() {
        System.out.println("Pressing a brake pedal...");
        System.out.println("Car stopped.");
    }

    public void serviceCar(int day, int month, int year) {
        this.lastServiceDate.setDay(day);
        this.lastServiceDate.setMonth(month);
        this.lastServiceDate.setYear(year);
        this.mileage = 0;
    }

    public void displayDetails() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Vin: " + this.vin);
        System.out.println("Color: " + this.color);
        System.out.println("Engine type: " + this.engineType);
        System.out.println("Number of doors: " + this.numberOfDoors);
        System.out.println("Horse power: " + this.horsePower);
        System.out.println("Mpg: " + this.mpg);
        System.out.println("Top speed: " + this.topSpeed);
        System.out.println("Owner: " + this.owner);
        System.out.println("Mileage: " + this.mileage);
        System.out.println("Last service date: " + this.lastServiceDate);
    }

    public double calculateFuelCost(double distance, double fuelPrice) {
        /* formula: (distance / mpg) * fuelPrice */

        if (distance < 0 || fuelPrice < 0) {
            throw new IllegalStateException("distance and fuel price cannot be negative!");
        }

        double fuelNeeded = distance / this.mpg;

        return fuelNeeded * fuelPrice;
    }
}
