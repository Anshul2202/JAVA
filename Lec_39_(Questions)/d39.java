public class d39 {

    public static void main(String arr[]) {
        checkRange(23, 12);
    }

    public static void checkRange(int x, int y) {

        if (x < 0 || y < 0) {
            System.out.println("Invalid Input ");
            return;
        }

        if (x >= 0 && x <= 99 && y >= 0 && y <= 99) {
            System.out.println("In Range...");
        } else {
            System.out.println("Not in Range!!!");
        }
    }
}
