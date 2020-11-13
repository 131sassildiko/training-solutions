package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client=new Client();

        System.out.println("What is your name?");
        client.name = scanner.nextLine();

        System.out.println("What is your age?");
        client.year = scanner.nextInt();

        System.out.println("What is your address?");
        client.address = scanner.nextLine(); //MIÉRT NEM TUDOK CÍMET MEGADNI???

        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);


    }
}
