public class a13 {

    public static void main(String arr[]) {

        // ----------- Arrays ------------

        int[] marks1 = { 1, 2, 3, 4, 5 };

        System.out.println(marks1[0]);

        // Other method of declaring an array....

        int[] marks2 = new int[5];
        marks2[0] = 1;

        System.out.println(marks2[0]);

        // To print out all the elements of an array.....
        // We can use a loop for that :-

        for (int i = 0; i < marks1.length; i++) {
            System.out.println("Element at " + i + " Index is = " + marks1[i]);
        }

    }
}
