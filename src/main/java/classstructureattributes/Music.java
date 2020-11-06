package classstructureattributes;


import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
    Scanner scanner = new Scanner();

    System.out.println("what's your favourite song?");
    Song.band = scanner.nextLine();
    System.out.println("what's the title?");
    Song.title = scanner.nextLine();
    System.out.println("what's the length?");
    Song.length = scanner.nextLine();
    System.out.println("song.band ", "song.title ", "somg.length")

}
}
