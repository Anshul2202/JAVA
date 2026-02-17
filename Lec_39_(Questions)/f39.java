public class f39 {

    public static void main(String arr[]) {

        gcd(12, 60);
    }

    public static void gcd(int n1, int n2) {

        int greatest = 0;

        for (int i = 1; (i <= n1 && i <= n2); i++) {

            if ((n1 % i == 0) && (n2 % i == 0)) {
                greatest = i;
            }
        }

        System.out.println("The gcd for both the numbers is : " + greatest);
    }
}
