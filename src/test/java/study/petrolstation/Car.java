package study.petrolstation;

public abstract class Car {

    public String test;
    // 자동차 모델명을 리턴한다.
    abstract String getCarName();
    abstract double getFuelEfficiency();
    abstract double getDistance();
    public double getEssentialFuel() {
        return getDistance() / getFuelEfficiency();
    };
}
