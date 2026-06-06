import java.util.*;

public class a74 {
    
    public static void main(String arr[]){

        HashSet<String> set = new HashSet<>();
        
        // add
        set.add("I");
        set.add("am");
        set.add("Learning");
        set.add("Java");

        System.out.println(set);

        // remove
        set.remove("Java");

        System.out.println(set);

        // iterator

        Iterator<String> IT = set.iterator();

        while(IT.hasNext()){
            System.out.println(IT.next());
        }
    }
}
