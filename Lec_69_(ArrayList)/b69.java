import java.util.*;

public class b69 {

    public static void main(String arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // add
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i : list) {
            System.out.println(i);
        }

        // remove
        list.remove(0);

        for (int i : list) {
            System.out.println(i);
        }

        // indexOf
        System.out.println(list.indexOf(3));

        //get
        System.out.println(list.get(0));

        //set
        list.set(0 , 0);

        for(int i : list){
            System.out.println(i);
        }

    }
}
