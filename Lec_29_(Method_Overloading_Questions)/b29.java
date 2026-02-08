public class b29 {

    public static void main(String arr[]) {

        String val1 = getDurationString(61, 0);
        System.out.println(val1);

        String val2 = getDurationString(95459);
        System.out.println(val2);
    }

    public static String getDurationString(int min, int sec) {

        if (min >= 0 && sec >= 0 && sec <= 59) {

            int hr = min / 60;
            int remainingMin = min % 60;
            return (hr + "H " + remainingMin + "min " + sec + "sec ");
        } else {
            return "Invalid";
        }

    }

    public static String getDurationString(int sec) {
        if (sec >= 0) {
            int mins = sec / 60;
            int remainingSec = sec % 60;
            return getDurationString(mins, remainingSec);

        } else {
            return "Invalid";
        }
    }
}
