public class c29 {

    public static void main(String arr[]) {

        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long mins) {
        long hr = mins / 60;
        long days = hr % 24;
        long tempDays = hr / 24;
        long year = tempDays / 365;
        System.out.println(year + "Years " + days + "days");
    }
}
