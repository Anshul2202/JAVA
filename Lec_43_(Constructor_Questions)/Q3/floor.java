package Q3;

public class floor {

    private double width;
    private double length;

    public floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

    }

    public double getArea() {
        double area = this.width * this.length;
        return (area);
    }
}
