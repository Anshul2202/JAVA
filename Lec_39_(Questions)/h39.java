public class h39 {

    public static void main(String arr[]) {

    }

    public static boolean isPerfect(int x) {

        int val = 0;

        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {
                val += i;
            }
        }

        if (x == val) {
            return true;
        } else {
            return false;
        }
    }
}
