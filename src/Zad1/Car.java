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

    @Override
    public void service(){System.out.println("Wymiana oleju");}
}
