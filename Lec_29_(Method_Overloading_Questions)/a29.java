public class a29 {

    public static void main(String arr[]) {

        int length = 10;
        int breadth = 20;
        area(length, breadth);

        int side = 5;
        area(side);

        int base = 10;
        double height = 15.3;
        area(base, height);

    }

    public static void area(int a) {
        System.out.println(a * a);
    }

    public static void area(int l, int b) {
        System.out.println(l * b);
    }

    public static void area(int b, double h) {
        double result = 0.5 * (b * h);
        System.out.println(result);
    }
}
