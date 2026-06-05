import java.util.*;

public class a73 {

    public static void main(String arr[]) {

        Map<Integer, String> student = new HashMap<>();

        // put
        student.put(1, "Anshul");
        student.put(2, "Siddharth");
        student.put(3, "Rahul");
        student.put(4, "Ayush");
        student.put(5, "Aman");

        // for(int key : student.keySet()){
        // System.out.println(key + " - " + student.get(key));
        // }

        // remove
        student.remove(4);

        // for (int key : student.keySet()) {
        // System.out.println(key + " - " + student.get(key));
        // }

        // replace
        student.replace(5, "Aman" , "Ayush");
        for (int key : student.keySet()) {
            System.out.println(key + " - " + student.get(key));
        }
    }
}