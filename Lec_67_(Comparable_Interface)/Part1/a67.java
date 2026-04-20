package Part1;

import java.util.*;

public class a67 {

    public static void main(String arr[]) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Siddharth", 97));
        list.add(new Student("Anshul", 95));
        list.add(new Student("Rahul", 96));
        list.add(new Student("Shreya", 99));

        Collections.sort(list);

        // Accessing All the Obejcts in the list

        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getMarks());
        }
    }
}
