import java.util.*;

public class a77 {
    
    public static void main(String arr[]){

        // HashSet with a maintained order is LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Siddharth");
        set.add("Anshul");
        set.add("Zebra");
        set.add("Rahul");

        Iterator<String> IT = set.iterator();

        while(IT.hasNext()){
            System.out.println(IT.next());
        }
    }
}
