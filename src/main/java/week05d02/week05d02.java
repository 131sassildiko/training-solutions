package week05d02;

import java.util.Random;
import java.util.Scanner;

public class week05d02 {
    public static class NumberGuesser {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int random = new Random().nextInt(101);

            boolean nyero = false;

            while (!nyero) {
                System.out.println("Gondolj egy számra!");
                int i = Integer.parseInt(scanner.nextLine());
                if (i > random) {
                    System.out.println("Túl sok");
                } else if (i < random) {
                    System.out.println("Túl kevés");
                } else {
                    System.out.println("Bingo, nyertél!! Gratula!!!");
                    nyero = true;
                }
            }
        }
    }
}
