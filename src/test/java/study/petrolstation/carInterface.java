package study.petrolstation;

public interface carInterface {
    String getCarName();
    double getFuelEfficiency();
    double getDistance();
    double getEssentialFuel();
    /*double getEssentialFuel() {
        return getDistance() / getFuelEfficiency();
    };*/

}
