package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers= new ArrayList<>();



    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }
    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger) {
        int booking = 0;
        while (booking< boat.getMaxPassengers()){
            passengers.add(passenger);
        }
    }

    public double getPriceForPassenger(Passenger passenger) {
    }

    public Passenger findPassengerByName(String passenger) {
    }

    public List<String> getPassengerNamesOrdered() {
    }

    public double sumAllBookingsCharged() {
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
    }
}
