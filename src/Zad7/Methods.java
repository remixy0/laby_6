package Zad7;

import Zad1.Vehicle;
import Zad2.Electric;

import java.lang.reflect.Array;

public class Methods{
    public static Vehicle[] filterElectric(Vehicle[] vehicles) {
        Vehicle [] filtered = Array.stream(vehicles).filter(x-> x instanceof Electric).toArray();
    }
}
