package models;

import java.util.ArrayList;

public class Vehicle {

    public Vehicle() {}

    public static ArrayList<Vehicle> factory (int instances) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i=0; i<instances; i++) {
            vehicles.add(new Vehicle());
        }

        return vehicles;
    }
}
