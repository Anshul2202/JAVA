public class a39 {

    public static void main(String arr[]) {

        int number = 121;

        if (isPalindrome(number)) {
            System.out.println(number + " is an palindrome number");
        } else {
            System.out.println(number + " is not an palindorme number!");
        }
    }

    public static boolean isPalindrome(int num) {

        int temp = num;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (rev == num) {
            return true;
        } else {
            return false;
        }
    }
}
