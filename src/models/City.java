package models;

import java.util.ArrayList;

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
    public ArrayList<Ride> rides;

    public Size size;

    public City (Size site, ArrayList<Vehicle> vehicles, ArrayList<Ride> rides) {
        this.size = site;
        this.vehicles = vehicles;
        this.rides = rides;
    }
}
