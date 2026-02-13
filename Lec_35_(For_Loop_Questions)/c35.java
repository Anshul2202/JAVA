import java.util.*;

public class c35 {

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int x) {

        for (int i = 2; i < x; i++) {

            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }

}
