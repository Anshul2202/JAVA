public class j29 {

    public static void main(String arr[]) {
        boolean isCatPlaying = isPlaying(true, 30);

        if (isCatPlaying) {
            System.out.println("Cat is playing :)");
        } else {
            System.out.println("Cat is not playing.....");
        }
    }

    public static boolean isPlaying(boolean summer, int temp) {

        if (!summer && temp >= 25 && temp <= 45) {
            return true;
        } else if (summer && temp >= 25 && temp <= 35) {
            return true;
        } else {
            return false;
        }
    }
}
