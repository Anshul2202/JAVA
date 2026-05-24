package Part2;

import java.util.*;

public class b72 {

    public static void main(String arr[]) {
        LinkedList<String> list = new LinkedList<>();

        ascAddList(list, "Phone");
        ascAddList(list, "Zebra");
        ascAddList(list, "Lion");
        ascAddList(list, "Apple");
        ascAddList(list, "Ball");

        ascAddList(list, "zebra");

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static boolean ascAddList(LinkedList<String> list, String word) {
        ListIterator<String> IT = list.listIterator();

        while (IT.hasNext()) {
            int compare = IT.next().compareTo(word);

            if (compare == 0) {
                System.out.println("Word Already existed");
                IT.add(word);
                return false;
            } else if (compare < 0) {
                // Nothing just check for next node
            } else if (compare > 0) {
                IT.previous();
                IT.add(word);
                return true;
            }
        }

        IT.add(word);
        return true;

    }
}
