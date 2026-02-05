import java.util.*;

public class a25 {

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which you want to print the table : ");
        int n = sc.nextInt();
        table(n);
    }

    public static void table(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
