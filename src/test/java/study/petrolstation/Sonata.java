package study.petrolstation;

public class Sonata extends Car {

    private final String carName = "Sonata";
    private final double fuelEfficiency = 10;
    private double distance;

    public Sonata(double distance) {
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
