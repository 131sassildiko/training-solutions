package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private final List<Item> budgetItems;

    public Budget(List<Item> budgetItems) {
        this.budgetItems = new ArrayList<>(budgetItems);
    }


    public List<Item> getItemsByMonts(int selectionMonth){
        if (selectionMonth < 1 || selectionMonth >12) {
            throw new IllegalArgumentException("Invalid month");
        }
        List<Item> result = new ArrayList<>();
        for (Item i:budgetItems){
            if (i.getMonth()==selectionMonth) {
                result.add(i);
            }
        }
        return result;
    }

}
