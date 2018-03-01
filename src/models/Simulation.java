package models;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

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
            city.vehicles.get(i).setRide(rides.get(i), i);
        }

        for (int i = 0; i < steps; i++) {
            for (Vehicle vehicle : city.vehicles) {

                vehicle.step(i);
            }
        }
        exportData();
    }

    private void exportData() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("output.out", "UTF-8");
            for (Vehicle vehicle : this.city.vehicles) {
                String toExport = vehicle.rides.size() + " ";
                for (int ride : vehicle.rides) {
                    toExport = toExport + " " + ride;
                }
                writer.println(toExport);
            }
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println("Error occurred in Simulation. Error stacktrace: " + e.getStackTrace());
        }

    }

    private static int nextAvailableRide = 0;

    public synchronized static int getNextRidePos() {

        nextAvailableRide++;

        return nextAvailableRide;
    }

    public synchronized static Ride getRide(int pos) {
        return rides.get(0);
    }
}
