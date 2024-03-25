package practica2;

public class Ball {
    private String name;
    private int circleLength;
    private int ballWeight;

    public Ball(String name, int circleLength, int ballWeight) {
        this.name = name;
        this.circleLength = circleLength;
        this.ballWeight = ballWeight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCircleLength(int circleLength) {
        this.circleLength = circleLength;
    }
    public void setBallWeight(int ballWeight) {
        this.ballWeight = ballWeight;
    }
    public String getName() {
        return name;
    }
    public int getCircleLength() {
        return circleLength;
    }
    public int getBallWeight() {
        return ballWeight;
    }
    public String toString() {
        return "Ball{name="+name+", circle length="+circleLength+", ball weight="+ballWeight+"}";
    }
}
