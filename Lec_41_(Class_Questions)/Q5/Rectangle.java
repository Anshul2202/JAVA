package Q5;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    // Get Methods......

    public double getLength() {
        if (length < 0) {
            this.length = 0;
            return length;
        } else {
            return length;
        }
    }

    public double getWidth() {
        if (width < 0) {
            this.width = 0;
            return width;
        } else {
            return width;
        }
    }

    public double getArea() {
        return (length * width);
    }
}
