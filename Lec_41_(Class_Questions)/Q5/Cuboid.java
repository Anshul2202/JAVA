package Q5;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);

        this.height = height;
    }

    // Get Methods.....

    public double getHeight() {
        if (height < 0) {
            this.height = 0;
            return height;
        } else {
            return height;
        }
    }

    public double getVolume() {
        double volume = getArea() * getHeight();
        return volume;
    }
}
