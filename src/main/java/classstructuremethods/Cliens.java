package classstructuremethods;

public class Cliens {
    private String name;
    private int yearofbirth;
    private String address;


    public String getName() {
        return name;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void migrate (String newaddress) {
        this.address = newaddress;
    }
}
