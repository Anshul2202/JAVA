import java.util.*;

public class b37 {

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printTable(n);

    }

    public static void printTable(int n) {

        int i = 1;

        while (i <= 10) {

            int table = n * i;
            System.out.println(n + " X " + i + " = " + table);
            i++;
        }
    }
}
