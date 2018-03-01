package models;

import java.util.ArrayList;

public class Vehicle {

    public ArrayList<Integer> rides = new ArrayList<>();

    public Position currentPosition = new Position(0, 0);
    public Ride currentRide;
    public int nextRide;

    public Vehicle() {
    }

    public void setRide(Ride ride, int ridePos) {
        this.currentRide = ride;

        rides.add(ridePos);
    }

    private void pickNextRide(int time) {
        if(currentRide.free) {
            currentRide = Simulation.getRide(rides.get(rides.size() - 1));
        } else {

            int nextRidePos = Simulation.getNextRidePos();

            rides.add(nextRidePos);

            Ride nextRide = Simulation.getRide(nextRidePos);

            currentRide = new Ride(currentPosition, nextRide.start, time, 100000);

            currentRide.free = true;
        }
    }

    public void step(int time) {
        if (currentPosition.row == currentRide.end.row && currentPosition.col == currentRide.end.col) {
            currentRide = null;
            pickNextRide(time);
        }

        if (currentPosition.row == currentRide.end.row) {
            if (currentPosition.col < currentRide.end.col) {
                currentPosition.col++;
            } else {
                currentPosition.col--;
            }
        } else {
            if (currentPosition.col < currentRide.end.col) {
                currentPosition.row++;
            } else {
                currentPosition.row--;
            }
        }
    }

    public int costToRide(Ride ride) {
        return ride.cost() + Math.abs(ride.start.col - currentPosition.col) + Math.abs(ride.start.row - currentPosition.row);
    }

    public static ArrayList<Vehicle> factory(int instances) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < instances; i++) {
            vehicles.add(new Vehicle());
        }

        return vehicles;
    }
}
