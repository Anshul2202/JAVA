package Part3;
import java.util.*;

public class CompareName implements Comparator<Animals2>{

    @Override
    public int compare(Animals2 a1 , Animals2 a2){
        if (a1.getName().compareTo(a2.getName()) > 0) {
            return 1;
        } else if (a1.getName().compareTo(a2.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
