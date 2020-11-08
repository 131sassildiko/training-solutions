package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

   client.setName("Ildi");
   client.setYear(1972);
   client.setAddress("Roka u 1");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("Bela u 2");
        System.out.println(client.getAddress());


    }



}
