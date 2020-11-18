package statement;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. óra?");
        int hour1 = scanner.nextInt();
        System.out.println("1. perc");
        int minute1 = scanner.nextInt();
        System.out.println("1. másodperc?");
        int second1 = scanner.nextInt();

        System.out.println("2. óra?");
        int hour2 = scanner.nextInt();
        System.out.println("2. perc");
        int minute2 = scanner.nextInt();
        System.out.println("2. másodperc?");
        int second2 = scanner.nextInt();



        Time time1 = new Time(hour1, minute1, second1);
        Time time2 = new Time(hour2, minute2, second2);

        System.out.println(time1.toString());
        System.out.println(time2.toString());
        System.out.println(time1.ealierThan(time2));


    }
}
