package week06d04;

import java.util.Arrays;

public class BudgetMain {

    public static void main(String[] args) {

        Budget budget = new Budget (Arrays.asList(
                new Item("fogkefe", 1200, 11),
                new Item ("zabkeksz", 300, 10),
                new Item ("habzobor", 1300, 12)
        ));
        System.out.println(budget.getItemsByMonts(1));
        System.out.println(budget.getItemsByMonts(12));
        System.out.println(budget.getItemsByMonts(11));




    }
}
