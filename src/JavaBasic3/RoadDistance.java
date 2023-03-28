package JavaBasic3;

public class RoadDistance {
    private double percentCompleted;
    private double remainingDistance;

    public double getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(double percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public double getRemainingDistance() {
        return remainingDistance;
    }

    public void setRemainingDistance(double remainingDistance) {
        this.remainingDistance = remainingDistance;
    }

    public double getTotalDistance() {
        return remainingDistance / (1 - percentCompleted);
    }

    public double getTotalDistance2() {
        double distanceTraveled = (percentCompleted * remainingDistance) / (1 - percentCompleted);
        return remainingDistance + distanceTraveled;
    }
}
