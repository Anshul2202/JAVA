public class Floor {

    private int floorNo;
    private int floorCapacity;

    public Floor(int floorNo, int floorCapacity) {
        this.floorNo = floorNo;
        this.floorCapacity = floorCapacity;
    }

    // Getter Methods

    public int getFloorNo() {
        return this.floorNo;
    }

    public int getfloorCapacity() {
        return this.floorCapacity;
    }

    // Some Methods

    public void cleanFloor() {
        System.out.println("Floor Cleaning Initiated....");
    }
}
