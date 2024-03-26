package pr4_1;

public class Circle {
    private double r;
    private double S;
    private double d;
    private double l;

    public Circle(double r) {
        this.r = r;
        S = Math.PI * (r * r);
        d = 2 * r;
        l = 2 * Math.PI * r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double getS() {
        return S;
    }
    public double getD() {
        return d;
    }
    public double l() {
        return l;
    }
    @Override
    public String toString() {
        return "Circle{"
                + "r = "+r+", "
                + "S = "+S+", "
                + "d = "+d+", "
                + "l = "+l;
    }
}
