public class i29 {

    public static void main(String arr[]) {

        printEqual(1, 3, 2);
    }

    public static void printEqual(int x, int y, int z) {

        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid");
        } else if (x == y && y == z) {
            System.out.println("All equal......");
        } else if (x != y && y != z && z != x) {
            System.out.println("All different");
        } else {
            System.out.println("Neither equal nor different........");
        }
    }
}
