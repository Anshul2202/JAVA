public class c29 {

    public static void main(String arr[]) {

        printYearsAndDays(525600);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long mins) {
        if (mins < 0) {
            System.out.println("Invalid Input");
            return;
        }
        long hr = mins / 60;
        long days = hr % 24;
        long tempDays = hr / 24;
        long year = tempDays / 365;
        System.out.println(year + "Years " + days + "days");
    }
}
