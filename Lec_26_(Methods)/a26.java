public class a26 {

    public static void main(String arr[]) {

        // ------------ Methods ------------

        int length = 10;
        int breadth = 20;

        int parameter = rectPara(length, breadth);
        System.out.println(parameter);

        // ---------------------------------

        double distance = 1000;
        double time = 30;

        getSpeed(distance, time);
    }

    public static int rectPara(int l, int b) {
        return 2 * (l + b);
    }

    public static void getSpeed(double dis, double time) {

        double speed = dis / time;
        System.out.println(speed);
    }
}
