package array;

public class ArrayMain {
    public static void main(String[] args) {
        String [] daysOfWeek={"hétfő", "kedd", "szerda", "csüt", "pént", "szomb", "vas"};
        System.out.println(daysOfWeek [1]);
        System.out.println(daysOfWeek.length);

        int[] kettohatvany = {1, 2, 4, 8, 16};
        for (int item: kettohatvany){
            System.out.println(item);
        }

        boolean[] akarmi = {false, true, false, true, false, true};

        for (boolean item: akarmi) {
            System.out.println(item);
        }

}
}