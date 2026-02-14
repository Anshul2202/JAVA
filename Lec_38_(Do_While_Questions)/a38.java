public class a38 {

    public static void main(String arr[]) {

        int num = 12345;
        int rem;
        int sum = 0;

        do {

            rem = num % 10;
            sum += rem;
            num /= 10;

        } while (num != 0);

        System.out.println(sum);
    }
}
