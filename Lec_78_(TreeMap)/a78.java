import java.util.*;

public class a78 {
    
    public static void main(String arr[]){


        // HashMap with an Ascending order is TreeMap
        TreeMap<Integer , String> map = new TreeMap<>();

        map.put(3 , "Anshul");
        map.put(8 , "Siddharth");
        map.put(5 , "Aman");
        map.put(1 , "Rahul");
        map.put(6 , "Ayush");

        for(int key : map.keySet()){
            System.out.println(key + " - " + map.get(key));
        }
    }
}
