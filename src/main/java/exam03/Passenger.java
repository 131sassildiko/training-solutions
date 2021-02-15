package exam03;

public class Passenger {

    private String Name;
    private CruiseClass cruiseClass;

    public Passenger(String name, CruiseClass cruiseClass) {
        Name = name;
        this.cruiseClass = cruiseClass;
    }

    public String getName() {
        return Name;
    }

    public CruiseClass getCruiseClass() {
        return cruiseClass;
    }
}
