class b14 {

    public static void main(String arr[]) {

        int[] arr1 = { 1, 2, 8, 10, 10, 12, 19 };
        int x = 5;
        int floor = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= x) {
                if (arr1[i] > floor) {
                    floor = arr1[i];
                }
            }
        }

        System.out.println(floor);
    }
}
