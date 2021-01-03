package week07d01;

public class MathAlgorithms {

    private int x;

    public MathAlgorithms(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public boolean isPrime(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        int div = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                div++;
            }
            if (div > 1) return false;
        }
        return true;
    }
}


