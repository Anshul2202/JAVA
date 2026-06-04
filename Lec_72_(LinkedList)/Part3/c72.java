package Part3;
import java.util.*;

public class c72 {
 
    public static void main(String arr[]){
        LinkedList<Integer> list = new LinkedList<>();

        ascAdd(list , 9);
        ascAdd(list , 0);
        ascAdd(list , 3);
        ascAdd(list , 8);
        ascAdd(list , 3);
        ascAdd(list , 2);

        for(int i : list){
            System.out.println(i);
        }
        
    }

    public static boolean ascAdd(LinkedList<Integer> list , int i ){
        ListIterator<Integer> IT = list.listIterator();
        

        while(IT.hasNext()){
            int compare = IT.next().compareTo(i);

            if(compare == 0){
                System.out.println(i + "Already Exists");
                return false;
            } else if(compare > 0){
                IT.previous();
                IT.add(i);
                return true;
            } else if(compare < 0){
                // just check for next node
            }
        }

        list.add(i);
        return true;

        
    }
}
