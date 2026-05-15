package Part3;

import java.util.*;

public class c68 {

    public static void main(String arr[]) {

        ArrayList<Animals2> list = new ArrayList<>();

        list.add(new Animals2("Dog", 50.74));
        list.add(new Animals2("Cat", 35.46));
        list.add(new Animals2("Elephant", 250.71));
        list.add(new Animals2("Monkey", 68.69));

        // CompareName compName = new CompareName();
        CompareHeight compHght = new CompareHeight();
        Collections.sort(list, compHght);

        for (Animals2 a : list) {
            System.out.println(a.getName() + " " + a.getHeight());
        }
    }
}
