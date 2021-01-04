package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    public List <Integer> getNumbers () {
        List<Integer> result = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            result.add(generateNumbersNotInList(result));
        }
        return result;
    }

        private Integer generateNumbersNotInList (List<Integer>myList){
        Random random = new Random();
        int number = random.nextInt(91);
        while (myList.contains(number)) {
                number = random.nextInt(91);
            }
            return number;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery ();
        System.out.println(lottery.getNumbers());
    }
}
