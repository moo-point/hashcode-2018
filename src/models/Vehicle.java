package models;

import java.util.ArrayList;

public class Vehicle {

    public Position currentPosition = new Position(0, 0);
    public Ride currentRide;

    public Vehicle() {}

    public void setRide(Ride ride) {
        this.currentRide = ride;
    }

    private void pickRide(int time) {
        


    }

    private void step(int time) {
        if(currentPosition.row == currentRide.end.row && currentPosition.col == currentRide.end.col) {
            currentRide = null;
            pickRide(time);
        }

        if(currentPosition.row == currentRide.end.row) {
            currentPosition.col++;
        } else {
            currentPosition.row ++;
        }
    }

    public int costToRide(Ride ride) {
        return  ride.cost() + Math.abs(ride.start.col - currentPosition.col) + Math.abs(ride.start.row - currentPosition.row);
    }

    public static ArrayList<Vehicle> factory (int instances) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i=0; i<instances; i++) {
            vehicles.add(new Vehicle());
        }

        return vehicles;
    }
}
