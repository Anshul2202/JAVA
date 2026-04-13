import java.util.*;

public class b66 {

    public static void main(String arr[]) {

        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);

        System.out.println(mylist);

        //
        mylist.addFirst(0);
        mylist.addLast(6);
        mylist.add(7);

        System.out.println(mylist);

        // Cloning a list

        ArrayList<Integer> mylist2 = new ArrayList<>();
        mylist2 = (ArrayList) mylist.clone();
        System.out.println(mylist2);

        // Sublist
        ArrayList<Integer> parentList = new ArrayList<>();
        parentList = (ArrayList) mylist.clone();

        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(5);
        subList.add(6);
        subList.add(7);

        int idx = Collections.indexOfSubList(parentList, subList);

        if (idx >= 0) {
            System.out.println("The index from which the sub list starts is : " + idx);
        } else {
            System.out.println("Not a sublist");
        }

        // Min & Max Values of List

        int max = Collections.max(mylist);
        System.out.println("The max value is : " + max);

        int min = Collections.min(mylist);
        System.out.println("The min value is : " + min);
    }
}
