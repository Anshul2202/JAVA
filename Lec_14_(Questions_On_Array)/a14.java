class a14 {

    public static void main(String arr[]) {

        int[] vals = { 22, 12, 34, 99, 23, 54, 65, 78, 43 };

        sortArr(vals);
    }

    public static int[] sortArr(int[] valArr) {

        int temp = 0;

        for (int i = 0; i < valArr.length; i++) {
            for (int j = i + 1; j < valArr.length; j++) {

                if (valArr[i] > valArr[j]) {
                    temp = valArr[i];
                    valArr[i] = valArr[j];
                    valArr[j] = temp;
                }
            }

        }
        printArr(valArr);

        return valArr;

    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}