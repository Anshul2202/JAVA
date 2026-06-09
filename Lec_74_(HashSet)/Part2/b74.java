package Part2;
import java.util.*;

public class b74 {
    
    public static void main(String arr[]){

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // ---------------------------------------------

        // Intersection

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println(set1 + " Intersection " + set2);
        System.out.println(intersection);

        // ----------------------------------------------

        // union
        
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(set1 + " Union " + set2);
        System.out.println(union);

        // -----------------------------------------------

        // Difference

        HashSet<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);

        System.out.println(set1 + " diff " + set2);
        System.out.println(diff);
    }
}
