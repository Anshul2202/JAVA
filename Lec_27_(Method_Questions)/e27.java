public class e27 {

    public static void main(String arr[]) {

        checkTriplet(3, 4, 5);
    }

    public static void checkTriplet(int a, int b, int c) {
        int lhs = (a * a + b * b);
        int rhs = (c * c);

        if (lhs == rhs) {
            System.out.println("It is a pythagorean triplet");
        } else {
            System.out.println("Not a pyhtagorean triplet");
        }
    }
}
