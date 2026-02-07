public class a28 {

    public static void main(String arr[]) {

        // -------- Method Overloading -----------
        printDetails("Anshul");
        printDetails(97);
        printDetails(5.11);
    }

    public static void printDetails(String name) {
        System.out.println(name);
    }

    public static void printDetails(int marks) {
        System.out.println(marks);
    }

    public static void printDetails(double height) {
        System.out.println(height);
    }
}
