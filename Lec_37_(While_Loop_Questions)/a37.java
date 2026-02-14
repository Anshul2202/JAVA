public class a37 {

    public static void main(String arr[]) {

        int val = 5;

        while (val <= 30) {

            if (checkOdd(val)) {
                System.out.println(val);
            }
            val++;
        }

    }

    public static boolean checkOdd(int x) {

        if (x % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
