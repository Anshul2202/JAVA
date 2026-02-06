import java.util.*;

public class b27 {

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the weight in Kgs : ");
        double KgWeight = sc.nextDouble();

        convert(KgWeight);

    }

    public static void convert(double kgs) {
        double grams = kgs * 1000;
        System.out.println("The weight in grams is : " + grams + "g");
    }
}
