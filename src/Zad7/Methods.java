package Zad7;

import Zad1.Vehicle;
import Zad2.Electric;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Methods{
    public static List<Vehicle> filterElectric(Vehicle[] vehicles) {
        List<Vehicle> list = new ArrayList();
        for(Vehicle v : vehicles){
            if(v instanceof Electric){
                list.add(v);
            }
        }
        return list;
    }


    public static List<Vehicle> filterByYear(Vehicle[] vehicles, int year) {
        List<Vehicle> list = new ArrayList();
        for(Vehicle v : vehicles){
            if(v.getYear() == year){
                list.add(v);
            }
        }
        return list;
    }

}
