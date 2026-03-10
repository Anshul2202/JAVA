package Q4;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);

        this.height = height;
    }

    // Get Methdos.......

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
