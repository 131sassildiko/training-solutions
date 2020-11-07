package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Client client = new Client();

            System.out.println("what's your name?");
            client.name = scanner.nextLine();
            System.out.println("what's your year of birth?");
            client.year = scanner.nextInt();
            System.out.println("what's your address?");
            client.address = scanner.nextLine();
            System.out.println("client.name" + "clients.birth" + "client.address");
        }
    }

}
