package week12d02;

public class Site {

    private int oddEven;
    private int length;
    private Fence fence;

    public Site(int oddEven, int length, Fence fence) {
        this.oddEven = oddEven;
        this.length = length;
        this.fence = fence;
    }

    public int getOddEven() {
        return oddEven;
    }

    public int getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }
}
