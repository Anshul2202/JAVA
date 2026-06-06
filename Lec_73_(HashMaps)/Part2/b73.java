package Part2;

import java.util.*;

public class b73 {

    public static void main(String arr[]) {

        HashMap<Integer, String> company = new HashMap<>();

        // put
        company.put(1, "Anshul");
        company.put(2, "Siddharth");
        company.put(3, "Aman");
        company.put(4, "Ayush");
        company.put(5, "Rahul");

        for (int key : company.keySet()) {
            System.out.println(key + " - " + company.get(key));
        }

        // remove

        company.remove(5);

        for (int key : company.keySet()) {
            System.out.println(key + " - " + company.get(key));
        }

        //replace

        company.replace(4 , "Rahul");

        for(int key : company.keySet()){
            System.out.println(key + " - " + company.get(key));
        }
    }
}
