package study.petrolstation;

public class K5 extends Car{

    private final String carName = "K5";
    private final double fuelEfficiency = 13;
    private double distance;
    public K5(double distance) {
        this.distance = distance;
    }

    @Override
    String getCarName() {
        return this.carName;
    }

    @Override
    double getFuelEfficiency() {
        return this.fuelEfficiency;
    }
    @Override
    double getDistance() {
        return this.distance;
    }
}
