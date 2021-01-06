package exam02;

public class ArraySelector {

    int a;
    int[] arrayOfNumbers = new int[a];

    public String selectEvens(int[] arrayOfNumbers) {
        StringBuilder result = new StringBuilder();
        if (a != 0) {
            result.append("[");
            for (a = 2; a < arrayOfNumbers.length; a += 2) {
                result.append(arrayOfNumbers[a]);
            }
            result.append("]");
        }
        return result.toString();
    }
}
