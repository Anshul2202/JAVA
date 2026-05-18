import java.util.*;

public class c69 {

    public static void main(String arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // Iterator For list
        Iterator<Integer> IT = list.listIterator();

        while (IT.hasNext()) {
            System.out.println(IT.next());
        }

        // Other printing method
        for (int i : list) {
            System.out.println(i);
        }

        // get Method
        System.out.println(list.get(0));

        // set Method
        list.set(0, -1);
        System.out.println(list.get(0));

        // remove Method
        list.remove(0);
        System.out.println(list.get(0));

        // indexOf Method
        System.out.println(list.indexOf(1));

        // size Method
        System.out.println(list.size());
    }
}
