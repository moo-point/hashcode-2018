package models;

import java.util.ArrayList;

public class Simulation {
    public static ArrayList<Ride> rides;

    public City city;
    public int bonus;
    public int steps;

    public Simulation (City city, int bonus, int steps) {
        this.city = city;
        this.bonus = bonus;
        this.steps = steps;
    }

    public void run() {
        for (int i=0; i<steps; i++) {
            for (Vehicle vehicle : city.vehicles) {
                vehicle.step(i);
            }
        }
    }


    private static int nextAvailableRide = 0;

    public synchronized static Ride getNextRide() {
        Ride ret = rides.get(nextAvailableRide);

        nextAvailableRide++;

        return ret;
    }


}
