import java.util.*;

public class c27 {

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data usage in kb : ");
        double kbVal = sc.nextDouble();

        convert(kbVal);
    }

    public static void convert(double kbData) {
        double mbData = kbData / 1024;
        System.out.println("The data usage in mb : " + mbData + "mb");
    }
}
