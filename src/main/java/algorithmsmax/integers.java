package algorithmsmax;

import java.util.List;

public class integers{

    public int max (List<Integer> numbers){
        int max = Integer.MIN_VALUE;
        for (Integer n: numbers){
            if (n>max){
                max = n;
            }
        }
        return max;
    }
}
