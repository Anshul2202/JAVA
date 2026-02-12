public class b35 {

    public static void main(String arr[]) {

        // ------ Print Table in reverse ---------

        printRevTable(8);
    }

    public static void printRevTable(int x) {

        for (int i = 10; i >= 1; i--) {
            System.out.println(x + " X " + i + " = " + (x * i));
        }
    }
}
