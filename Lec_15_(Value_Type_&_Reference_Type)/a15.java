import java.util.Arrays;

public class a15 {

    public static void main(String arr[]) {

        // --------- Value Type ----------
        int x = 5;
        int y = x;

        System.out.println(x);
        System.out.println(y);

        // Now if o change the value of y
        y = 6;

        System.out.println("The new value of x = " + x);
        System.out.println("The new value of y = " + y);

        // --------- Reference Type ----------

        int[] arr1 = new int[5];
        int[] arr2 = arr1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // Now if i change the value in arr2

        arr2[0] = 5;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // The value of both the arrays has been changed
        // It is because in reference type all the variables points to the same memory
        // location
        // So if one of them makes changes the values will be changed for all

    }
}
