package attributes;

public class Person {

    private String name;
    private String idCard;
    private Address address;

    public Person(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }
    public void correctData (String name, String idCard){
        this.name = name;
        this.idCard = idCard;
    }

    public void moveTo (Address address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }

    public Address getAddress() {
        return address;
    }

    public String personToString () {
        return getName()+","+getIdCard();
    }
}
