public class d27 {

    public static void main(String arr[]) {

        boolean val = shouldWakeUp(false, 2);

        if (val) {
            System.out.println("We need to wake up");
        } else {
            System.out.println("Keep sleeping");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking) {
            if (hourOfDay < 8 && hourOfDay >= 0) {
                return true;
            } else if (hourOfDay >= 22 && hourOfDay < 24) {
                return true;
            }
            return false;
        } else {
            return false;
        }

    }
}
