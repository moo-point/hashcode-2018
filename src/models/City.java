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

    public Size size;

    public City (Size site, ArrayList<Vehicle> vehicles) {
        this.size = site;
        this.vehicles = vehicles;
    }
}
