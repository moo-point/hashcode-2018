package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class City {

    public static class Size {
        int rows;
        int cols;

        public Size(int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
        }
    }


    public ArrayList<Vehicle> vehicles;
    public static ArrayList<Ride> rides;


    public Size size;

    private static int nextAvailableRide = 0;

    public City (Size site, ArrayList<Vehicle> vehicles, List<Ride> rides) {
        this.size = site;
        this.vehicles = vehicles;

        rides = Collections.synchronizedList(rides);
    }

    public Ride getNextRide() {
        Ride ret = rides.get(nextAvailableRide);

        nextAvailableRide++;

        return ret;
    }
}
