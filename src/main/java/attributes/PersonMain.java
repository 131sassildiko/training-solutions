package attributes;

public class PersonMain {
    public static void main(String[] args) {
        PersonMain personmain = new PersonMain();
        Person person = new Person("Jani", "AV200");
        Address address = new Address ("Hu", "BP", "AB200", "2300");

        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println( person.getAddress().addressToString());

        person.correctData("Béla", "AC200");
        System.out.println(person.personToString());

        person.getAddress().correctData("Ro", "Várad", "Horea 2", "1180");
        System.out.println(person.getAddress().addressToString());

    }


}
