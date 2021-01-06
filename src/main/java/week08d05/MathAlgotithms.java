package week08d05;

public class MathAlgotithms {

    public int greatestCommonDivisor(int a, int b) {
        int maxDivisor = 1;
        for (int divisor = 2; divisor <= Math.min(a, b); divisor++) {
            if (a % divisor == 0 && b % divisor == 0) {
                maxDivisor = divisor;
            }
        }
        return maxDivisor;
    }
}
