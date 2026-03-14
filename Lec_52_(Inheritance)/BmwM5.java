public class BmwM5 extends Car {

    private String yearOfManufacture;
    private double cost;

    public BmwM5(String name, double topSpeed, String sunRoof, String grounfClearance, String yearOfManufacture,
            double cost) {
        super(name, topSpeed, sunRoof, grounfClearance);
        this.yearOfManufacture = yearOfManufacture;
        this.cost = cost;
    }

    @Override
    public void getDetails() {
        System.out.println(yearOfManufacture + " And the cost is " + cost);
    }
}
