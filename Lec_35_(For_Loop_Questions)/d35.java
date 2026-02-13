public class d35 {

    public static void main(String arr[]) {

        sumEven(0, 100);

    }

    public static boolean isEven(int n) {

        if (n < 0) {
            return false;
        } else if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void sumEven(int start, int end) {

        int sum = 0;

        for (int i = start; i <= end; i++) {

            if (isEven(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
