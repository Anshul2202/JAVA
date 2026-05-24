package Part1;
import java.util.*;

public class a72 {
    
    public static void main(String arr[]){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // for(int i : list){
        //     System.out.println(i);
        // }

        Iterator<Integer> IT = list.listIterator();

        while(IT.hasNext()){
            System.out.println(IT.next());
        }
        System.out.println("..........................");

        list.add(3 , 10);

        for(int i : list){
            System.out.println(i);
        }
        System.out.println("..........................");

        list.remove(3);

        for(int i : list){
            System.out.println(i);
        }
    }
}
