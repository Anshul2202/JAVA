import java.util.*;

public class a66 {

    public static void main(String arr[]) {

        // Collection Frameworks

        // List
        List<Integer> list = new ArrayList();

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
        Iterator IT = list.listIterator();

        while (IT.hasNext()) {
            System.out.println(IT.next());
        }

        // Binary Search In The List
        int idx = Collections.binarySearch(list, 8);
        System.out.println("The value 8 is at the index : " + idx);
    }
}
