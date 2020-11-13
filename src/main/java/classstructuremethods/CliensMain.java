package classstructuremethods;

import java.util.Scanner;

public class CliensMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliens cliens = new Cliens();

       cliens.setName("Zoli");
       cliens.setYearofbirth(1970);
       cliens.setAddress("Jókai u 2");

        System.out.println( cliens.getName());
        System.out.println(cliens.getAddress());
        System.out.println(cliens.getYearofbirth());

        cliens.migrate("Jókai u4");
        System.out.println(cliens.getAddress());

    }
}
