public class c39 {

    public static void main(String arr[]) {

        printOddSum(123456789);
    }

    public static void printOddSum(int n) {

        if (n < 0) {
            System.out.println("Invalid input!");
            return;
        }

        int temp = 0;
        int sum = 0;

        while (n != 0) {
            temp = n % 10;
            if (temp % 2 != 0) {
                sum += temp;
            }
            n /= 10;
        }

        System.out.println("The sum of odd digits is : " + sum);
    }
}
