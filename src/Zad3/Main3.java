package Zad3;

import Zad1.Car;
import Zad1.Motorcycle;
import Zad1.Truck;
import Zad1.Vehicle;
import Zad2.ElectricCar;

public class Main3 {
    public static void main(String[] args) {
        Vehicle[] lista = new Vehicle[6];
        lista[0] = new Car("Skoda",2004);
        lista[1] = new Car("Ford",2005);
        lista[2] = new Truck("Chevy",2000);
        lista[3] = new Truck("BMW",2012);
        lista[4] = new Motorcycle("HarleyDavidson",2020);
        lista[5] = new ElectricCar("KTM",2016);

        for(Vehicle v : lista){
            Workshop.service(v);

        }
    }
}
