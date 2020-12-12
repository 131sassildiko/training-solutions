package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = new Person("Miki", 21);
        Person person2 = person1;

        person2.setName("Nóra");

        System.out.println(person1.getName()+" " + person1.getAge());
        System.out.println(person2.getName()+" " + person2.getAge());

        int a = 24;
        int b = a;

        b++;

        System.out.println(a);
        System.out.println(b);

        Person newPerson = new Person("Béla", 32);

        System.out.println(person1.getName()+ " " + person1.getAge());
        System.out.println(newPerson.getName()+ " "+newPerson.getAge() );


    }
}
