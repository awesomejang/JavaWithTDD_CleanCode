package study.petrolstation;

public class RentCompanyTest {
    public static void main(String[] args) {
        RentCompany company = RentCompany.create();
        company.addCar(new K5(260));

        company.getCarList().forEach(car -> {
            System.out.println(car.getEssentialFuel());
        });



    }
}
