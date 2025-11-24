package Zad1;

public class Truck extends Vehicle {
    public Truck(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }


    @Override
    public double getFuelConsumption() {
        return 602;
    }
}
