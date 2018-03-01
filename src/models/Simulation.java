package models;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Simulation {
    public static ArrayList<Ride> rides;

    public City city;
    public int bonus;
    public int steps;

    public Simulation(City city, ArrayList<Ride> theRides, int bonus, int steps) {
        this.city = city;
        this.bonus = bonus;
        this.steps = steps;

        rides = theRides;
    }

    public void run() {

        // init starting rides
        for (int i=0; i<city.vehicles.size(); i++) {
            int pos = nextAvailableRide.getAndIncrement();
            city.vehicles.get(i).setRide(rides.get(pos), pos);
        }

        for (int i = 0; i < steps; i++) {
            for (Vehicle vehicle : city.vehicles) {

                vehicle.step(i);
            }
        }
    }



    private static AtomicInteger nextAvailableRide = new AtomicInteger();

    public synchronized static int getNextRidePos() {

        return nextAvailableRide.getAndIncrement();
    }

    public synchronized static Ride getRide(int pos) {
        return rides.get(pos);
    }
}
