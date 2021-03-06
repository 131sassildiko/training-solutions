package week07d01;

public class MathAlgorithms {

    private int x;

    public MathAlgorithms(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public static boolean isPrime(int x) {
        if (x < 1) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        if (x==1){
            return true;
        }
        if (x==2){
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
            return false;
        }
        return true;
    }
}


