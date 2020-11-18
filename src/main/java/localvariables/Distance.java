package localvariables;

public class Distance {

    private double dist;
    private boolean punct;

    public double getDist() {
        return dist;
    }

    public boolean isPunct() {
        return punct;
    }

    public Distance(double dist, boolean punct) {
        this.dist = dist;
        this.punct = punct;
    }
}
