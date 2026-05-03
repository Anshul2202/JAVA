import java.util.*;

public class a69 {

    public static void main(String arr[]) {
        // -------- ArrayList ---------------

        ArrayList<String> cart = new ArrayList<>();

        // ---------------------------------------------------------

        // Add method
        cart.add("Fruits");
        cart.add("Chips");
        cart.add("Cake");
        cart.add("Vegies");

        // ----------------------------------------------------------

        // Iterator
        Iterator<String> IT = cart.listIterator();

        while (IT.hasNext()) {
            System.out.println(IT.next());
        }

        // -----------------------------------------------------------

        // get Method
        System.out.println(cart.get(0));
        System.out.println(cart.get(3));

        // -----------------------------------------------------------

        // set Method -----> (For Modification)

        for (String s : cart) {
            System.out.println(s);
        }
        System.out.println("\n\n");

        cart.set(0, "Drinks");

        for (String s : cart) {
            System.out.println(s);
        }

    }

}
