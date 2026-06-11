import java.util.*;

public class a79{

    public static void main(String arr[]){

        // HashSet with a Ascending order maintained is TreeSet
        TreeSet<String> set = new TreeSet<>();

        set.add("siddharth");
        set.add("rahul");
        set.add("xaya");
        set.add("anshul");
        set.add("ayush");

        Iterator<String> IT = set.iterator();

        while(IT.hasNext()){
            System.out.println(IT.next());
        }
    }
}