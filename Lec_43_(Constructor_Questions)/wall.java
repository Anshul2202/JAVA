public class wall {

    private double height;
    private double width;

    public wall() {

    }

    public wall(double heigth, double width) {
        if (height < 0) {
            this.height = 0;
        }

        this.height = heigth;

        if (width < 0) {
            this.width = 0;
        }

        this.width = width;
    }

    public String getWidth() {
        return ("Width : " + this.width);
    }

    public String getHeight() {
        return ("Heigth : " + this.height);
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

    public String getArea() {
        double area = this.height * this.width;

        return ("The area of the wall is : " + area);

    }
}