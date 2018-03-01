package models;

public class Ride {
    public Position start;
    public Position end;
    public int startEarliest;
    public int finishLatest;

    public boolean occupied;

    public boolean free;

    public int cost() {
        return Math.abs(start.col - end.col) + Math.abs(start.row - end.row);
    }

    public Ride(Position start, Position end, int startEarliest, int finishLatest) {
        this.start = start;
        this.end = end;
        this.startEarliest = startEarliest;
        this.finishLatest = finishLatest;
    }


}
