public class Car {

    private String carName;
    private double topSpeed;
    private String sunRoof;
    private String groundClearance;

    public Car(String name, double topSpeed, String sunRoof, String grounfClearance) {
        this.carName = name;
        this.topSpeed = topSpeed;
        this.sunRoof = sunRoof;
        this.groundClearance = grounfClearance;
    }

    public void getDetails() {
        System.out.println(carName + " " + topSpeed + " " + sunRoof + " " + groundClearance);
    }
}