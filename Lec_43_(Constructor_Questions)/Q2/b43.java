package Q2;

public class b43 {

    public static void main(String arr[]) {

        wall w1 = new wall(6, 8);
        System.out.println("Area = " + w1.getArea());

        w1.setHeight(-1.5);
        System.out.println("Width = " + w1.getWidth());
        System.out.println("Height = " + w1.getHeight());
        System.out.println("Area = " + w1.getArea());

    }
}
