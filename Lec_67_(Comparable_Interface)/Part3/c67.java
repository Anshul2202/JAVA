package Part3;

import java.util.*;

public class c67 {

    public static void main(String arr[]) {

        ArrayList<Animals> list = new ArrayList<>();

        list.add(new Animals("Dog", 50.74));
        list.add(new Animals("Cat", 35.46));
        list.add(new Animals("Elephant", 250.71));
        list.add(new Animals("Monkey", 68.69));

        Collections.sort(list);

        for (Animals a : list) {
            System.out.println(a.getName() + " " + a.getHeight());
        }
    }
}
