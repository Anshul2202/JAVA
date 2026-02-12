import java.util.*;

public class c33 {

    public static void main(String arr[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();

        System.out.println("Enter the month : ");
        int month = sc.nextInt();

        getDays(month, year);
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 != 0))
            return true;
        else
            return false;
    }

    public static void getDays(int month, int year) {

        if (month > 12 || month < 1) {
            System.out.println("Invalid Input!");
            return;
        }

        if ((year > 9999 || year < 1)) {
            System.out.println("Invalid Input!");
            return;
        }

        switch (month) {

            case 1:
                System.out.println("Jan has 31 days in " + year);
                break;
            case 2:
                System.out.println("Feb has" + (isLeapYear(year) ? " 29 days in " : " 28 days in ") + year);
                break;
            case 3:
                System.out.println("March has 31 days in " + year);
                break;
            case 4:
                System.out.println("April has 30 days in " + year);
                break;
            case 5:
                System.out.println("May has 31 days in " + year);
                break;
            case 6:
                System.out.println("June has 30 days in " + year);
                break;
            case 7:
                System.out.println("July has 31 days in " + year);
                break;
            case 8:
                System.out.println("August has 30 days in " + year);
                break;
            case 9:
                System.out.println("September has 31 days in " + year);
                break;
            case 10:
                System.out.println("Octuber has 30 days in " + year);
                break;
            case 11:
                System.out.println("November has 31 days in " + year);
                break;
            case 12:
                System.out.println("December has 30 days in " + year);
                break;
        }
    }
}
