package Part2;

import java.util.*;

public class CompareMarks implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return (s1.getMarks() - s2.getMarks());
    }
}
