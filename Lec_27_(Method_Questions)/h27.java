public class h27 {

    public static void main(String arr[]) {

        boolean result = isNotTeen(13, 12, 15);
        System.out.println(result);
    }

    public static boolean isNotTeen(int a, int b, int c) {
        return ((a > 12 && b > 12 && c > 12) && (a < 20 && b < 20 && c < 20));
    }
}
