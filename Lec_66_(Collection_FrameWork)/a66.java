import java.util.*;

public class a66 {

    public static void main(String arr[]) {

        // Collection Frameworks

        // List ------> ArrayList
        List<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // Sorting the List
        Collections.sort(list);

        // Creating Iterator For List
        Iterator<Integer> IT = list.listIterator();

        while (IT.hasNext()) {
            System.out.println(IT.next());
        }

        // Binary Search In The List
        int idx = Collections.binarySearch(list, 8);
        System.out.println("The value 8 is at the index : " + idx);

        // --------------------------------------------------------------

        // List -----> LinkedList

        List<Integer> list2 = new LinkedList<>();

        list2.add(3);
        list2.add(4);
        list2.add(8);
        list2.add(0);
        list2.add(5);
        list2.add(9);

        System.out.println(list2);

        // Sorting list
        Collections.sort(list2, Collections.reverseOrder());

        System.out.println(list2);

        // Creating Iterator
        Iterator<Integer> IT2 = list2.listIterator();

        while (IT2.hasNext()) {
            System.out.println(IT2.next());
        }

    }
}
