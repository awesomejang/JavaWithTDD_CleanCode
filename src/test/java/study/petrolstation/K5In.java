package study.petrolstation;

public class K5In implements carInterface{

    private final String carName = "K5";
    private final double fuelEfficiency = 13;
    private double distance;

    @Override
    public String getCarName() {
        return this.carName;
    }

    @Override
    public double getFuelEfficiency() {
        return this.fuelEfficiency;
    }

    @Override
    public double getDistance() {
        return this.distance;
    }

    @Override
    public double getEssentialFuel() {
        return getDistance() / getFuelEfficiency();
    }
}
