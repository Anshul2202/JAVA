public class a31 {

    public static void main(String arr[]) {

        // --------- else if Statement ------------

        int stuMarks = 90;

        if (stuMarks == 100) {
            System.out.println("S");
        } else if (stuMarks < 100 && stuMarks > 90) {
            System.out.println("A");
        } else if (stuMarks <= 90 && stuMarks > 80) {
            System.out.println("B");
        } else if (stuMarks <= 80 && stuMarks > 70) {
            System.out.println("C");
        } else if (stuMarks <= 70 && stuMarks > 60) {
            System.out.println("D");
        } else if (stuMarks <= 60) {
            System.out.println("P");
        } else {
            System.out.println("Invalid input");
        }
    }
}
