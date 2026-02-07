public class g27 {

    public static void main(String arr[]) {

        boolean result = checkVals(2, 3, 6);
        System.out.println(result);
    }

    public static boolean checkVals(int a, int b, int c) {
        return ((a * b) == c);
    }
}
