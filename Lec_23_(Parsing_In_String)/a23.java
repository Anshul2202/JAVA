public class a23 {

    public static void main(String arr[]) {

        // ------ Parsing Values From String --------

        String myString1 = "2500";
        System.out.println(myString1);

        myString1 += 1;
        System.out.println(myString1);

        // Insted of adding the value it appended it at the end

        myString1 = "2500";
        int val1 = Integer.parseInt(myString1);
        System.out.println(val1);

        val1 += 1;
        System.out.println(val1);

        // For Double

        String myString2 = "2500.2323";

        double val2 = Double.parseDouble(myString2);
        val2 += 25;
        System.out.println(val2);

        // That's how parsing is done in a string...........

    }
}