public class a7 {

    public static void main(String arr[]) {

        // -------- Float Data Type ---------

        float floatMaxVal = Float.MAX_VALUE;
        float floatMinVal = Float.MIN_VALUE;

        System.out.println(floatMaxVal);
        System.out.println(floatMinVal);

        // -------- Double Data Type ---------

        double doubleMaxVal = Double.MAX_VALUE;
        double doubleMinVal = Double.MIN_VALUE;

        System.out.println(doubleMaxVal);
        System.out.println(doubleMinVal);

        // Double is most frequently used in coding
        // Because it's faster than using float
        // Declaring float and doulbe

        float num1 = 10;
        double num2 = 10;

        // If we try to assign point values

        // float num3 = 10.0;
        // double num4 = 10.0;

        // The flaot value will show error but the double will not
        // Because the compiler by default considers it to be double value
        // Because double is most frequently used

        float num3 = 10.0f;
        double num4 = 10.0;
        double num5 = 10.0d;

        System.out.println(num1 + num2 + num3 + num4 + num5);

    }
}