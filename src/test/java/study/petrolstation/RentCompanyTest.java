package study.petrolstation;

public class RentCompanyTest {
    public static void main(String[] args) {
        RentCompany company = RentCompany.create();
        company.addCar(new K5(260));
        company.addCar(new Sonata(150));

        company.generateReport();
    }
}
