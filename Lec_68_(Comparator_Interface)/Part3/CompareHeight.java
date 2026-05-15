package Part3;

import java.util.*;

public class CompareHeight implements Comparator<Animals2> {

    @Override
    public int compare(Animals2 a1, Animals2 a2) {
        return (int) (a1.getHeight() - a2.getHeight());
    }

}
