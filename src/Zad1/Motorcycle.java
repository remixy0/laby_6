package Zad1;

public class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    public double getFuelConsumption() {
        return 50;
    }

    @Override
    public void service(){System.out.println("Smarowanie łancucha");}

}
