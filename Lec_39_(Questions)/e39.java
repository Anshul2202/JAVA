public class e39 {

    public static void main(String arr[]) {

        if (checkLastDigit(22, 42, 40)) {
            System.out.println("Same last digit.....");
        } else {
            System.out.println("Not same!");
        }

    }

    public static boolean checkLastDigit(int n1, int n2, int n3) {

        int l1 = n1 % 10;
        int l2 = n2 % 10;
        int l3 = n3 % 10;

        if ((n1 < 10 || n1 > 1000) || (n1 < 10 || n2 > 1000) || (n3 < 10 || n3 > 1000)) {
            System.out.println("Invalid - Not in Range!");
            return false;
        }

        if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
            return true;
        } else {
            return false;
        }
    }
}
