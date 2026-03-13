public class Circle {

    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        this.area = Math.PI * radius * radius;
        return (area);
    }
}
