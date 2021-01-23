package week11d02;

public class Ride {

    private int dayNumber;
    private int rideNumber;
    private double km;

    public Ride(int dayNumber, int rideNumber, double km) {
        this.dayNumber = dayNumber;
        if (dayNumber<1 || dayNumber >7){
            throw new IllegalArgumentException("Invalid day");
        }
        this.rideNumber = rideNumber;
        if (km==0.0){
            throw new IllegalArgumentException("Invalid km");
        }
        this.km = km;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public int getRideNumber() {
        return rideNumber;
    }

    public double getKm() {
        return km;
    }
}
