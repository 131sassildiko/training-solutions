package week12d03;

public class Main {

    public static void main(String[] args) {
        NumberStat ns = new NumberStat();
        ns.readFromFime("text.txt");
        System.out.println(ns.findSmallestUnique());
    }
}
