package study.petrolstation;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
   private List<Car> carList = new ArrayList<>();

   public static RentCompany create() {
       return new RentCompany();
   }
   public void addCar(Car car) {
       carList.add(car);
   }

    public List<Car> getCarList() {
        return this.carList;
    }
}
