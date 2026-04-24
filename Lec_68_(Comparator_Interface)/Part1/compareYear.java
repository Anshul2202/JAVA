package Part1;
import java.util.*;

public class compareYear implements Comparator<Movie> {
    
    @Override
    public int compare(Movie m1 , Movie m2){
        return m1.getYear() - m2.getYear();
    }
}
