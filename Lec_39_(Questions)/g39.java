public class g39 {

    public static void main(String arr[]) {

        printFactor(6);
    }

    public static void printFactor(int x) {

        if (x < 0) {
            System.out.println("Invalid input!");
            return;

        }

        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
