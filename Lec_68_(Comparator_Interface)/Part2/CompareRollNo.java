package Part2;

import java.util.*;

public class CompareRollNo implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return (s1.getRollNo() - s2.getRollNo());
    }
}
