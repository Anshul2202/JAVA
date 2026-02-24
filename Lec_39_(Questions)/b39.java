public class b39 {

    public static void main(String arr[]) {
        sumFirstAndLast(252);

    }

    public static void sumFirstAndLast(int n) {

        if (n < 0) {
            System.out.println("Invalid input!!");
            return;
        }

        int temp = n;
        int lastDigit = temp % 10;
        int firstDigit = 0;

        while (true) {
            temp /= 10;
            if (temp != 0) {
                firstDigit = temp;
            } else {
                break;
            }
        }

        System.out.println("The sum of first & last digit : " + (firstDigit + lastDigit));
    }
}
