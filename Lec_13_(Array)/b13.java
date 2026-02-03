import java.util.*;

public class b13 {

    // Taking input from user for an array
    // ...................................

    public static void main(String arr[]) {

        // Taking input from user in an array

        int[] marks = getArray(5);

        getSum(marks);

    }

    //
    //
    // ---------- Function for array declaration ------------

    public static int[] getArray(int size) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + size + " Elements for the array ");

        int[] tempArr = new int[size];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = sc.nextInt();
        }

        for (int i = 0; i < tempArr.length; i++) {
            System.out.println(tempArr[i]);
        }

        return tempArr;

    }

    //
    //
    // --------- Function for calculating sum of all the elements -----------

    public static int getSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the elements of the array is = " + sum);

        return sum;

    }
}
