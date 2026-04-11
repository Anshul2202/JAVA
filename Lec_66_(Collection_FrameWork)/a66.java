import java.util.*;

public class a66 {

    public static void main(String arr[]) {

        // Collection Frameworks

        // List
        List<Integer> list = new ArrayList();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Creating Iterator For List

        Iterator IT = list.listIterator();

        while (IT.hasNext()) {
            System.out.println(IT.next());
        }
    }
}
