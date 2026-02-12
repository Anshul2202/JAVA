class a35 {

    public static void main(String arr[]) {

        // ----- Print a table of a numeber ---------

        printTable(7);
    }

    public static void printTable(int x) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + (i * x));
        }
    }
}