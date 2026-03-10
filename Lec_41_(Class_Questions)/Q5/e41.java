package Q5;

public class e41 {

    public static void main(String arr[]) {

        Rectangle rectangle = new Rectangle(2, 3);

        System.out.println("rectangle length =" + rectangle.getLength());

        System.out.println("rectangle width =" + rectangle.getWidth());

        System.out.println("area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(2, 3, 5);

        System.out.println("height= " + cuboid.getHeight());

        System.out.println("cuboid volume= " + cuboid.getVolume());
    }
}
