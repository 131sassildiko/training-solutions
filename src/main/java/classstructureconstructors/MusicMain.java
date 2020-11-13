package classstructureconstructors;

import java.util.Scanner;

public class MusicMain {
    public static void main(String[] args) {
        Song music = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your favourite song?");
        music.band = scanner.nextLine();

        System.out.println("What is the title?");
        music.title = scanner.nextLine();

        System.out.println("What is the lenght?");
        music.length = scanner.nextInt();

        System.out.println(music.band +" " + music.title + " " + music.length
        );

    }
}
