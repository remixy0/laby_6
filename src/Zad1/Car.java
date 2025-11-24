package Zad1;

public class Car extends Vehicle {
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public double getFuelConsumption() {
        return 178;
    }
}
