import java.util.*;

public class a76 {

    public static void main(String arr[]) {

        // Ordered Version of HashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Anshul");
        map.put(2, "Siddharth");
        map.put(3, "Ayush");
        map.put(4, "Rahul");
        map.put(5, "Aman");

        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        map.remove(5);

        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        map.replace(4, "Aman");

        for (int key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

    }
}