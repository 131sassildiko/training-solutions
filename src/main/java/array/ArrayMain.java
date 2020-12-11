package array;

public class ArrayMain {
    public static void main(String[] args) {
        String [] daysOfWeek={"hétfő", "kedd", "szerda", "csüt", "pént", "szomb", "vas"};
        System.out.println(daysOfWeek [1]);
        System.out.println(daysOfWeek.length);

        System.out.println();

        int[] kettohatvany = new int[5];
        kettohatvany [0] = 1;
        for (int i=1; i<kettohatvany.length; i++){
            kettohatvany [i] = kettohatvany [i-1]*2;
                    }
        for (int item: kettohatvany){
            System.out.println(item);
        }
        System.out.println();

        boolean[] akarmi = new boolean[6];
        for (int i=1; i< akarmi.length; i++) {
            akarmi [i] = ! akarmi [i-1];
        }

        for (boolean item: akarmi) {
            System.out.println(item);
        }

}
}