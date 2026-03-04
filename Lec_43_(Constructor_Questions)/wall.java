public class wall {

    private double height;
    private double width;

    public wall() {

    }

    public wall(double heigth, double widht) {
        if (height < 0) {
            this.height = 0;
        }

        if (width < 0) {
            this.width = 0;
        }
    }

    public void getWidth() {
        System.out.println("Width : " + this.width);
    }

    public void getHeight() {
        System.out.println("Heigth : " + this.height);
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }
    }

    public void getArea() {
        double area = this.height * this.width;

        System.out.println("The area of the wall is : " + area);

    }
}