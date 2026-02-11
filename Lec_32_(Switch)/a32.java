public class a32 {

    public static void main(String arr[]) {

        // ------------ switch -----------------

        int x = 4;

        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("Input out of range");

                // -----------------------------------

                String days = "Sunday";

                switch (days.toLowerCase()) {
                    case "sunday":
                        System.out.println("Sunday");
                        break;
                    case "monday":
                        System.out.println("Monday");
                        break;
                    case "tuesday":
                        System.out.println("Tuesday");
                        break;
                    case "wednesday":
                        System.out.println("Wednesday");
                        break;
                    case "thursday":
                        System.out.println("Thursday");
                        break;
                    case "friday":
                        System.out.println("Friday");
                        break;
                    case "saturday":
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;

                }

        }
    }
}
