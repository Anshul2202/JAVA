public class f27 {

    public static void main(String arr[]) {

        boolean result1 = isEqual(1.176231, 1.176232, 1.176233);
        System.out.println(result1);

        boolean result2 = isEqual(2.23543, 2.235432, 2.235451);
        System.out.println(result2);

    }

    public static boolean isEqual(double val1, double val2, double val3) {

        val1 = Math.round(val1 * 100000);
        val2 = Math.round(val2 * 100000);
        val3 = Math.round(val3 * 100000);
        if ((val1 == val2) && (val2 == val3)) {
            return true;
        } else {
            return false;
        }
    }
}
