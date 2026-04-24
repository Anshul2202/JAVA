package Part2;

import java.util.*;

public class b68 {

    public static void main(String arr[]) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Siddharth", 89));
        list.add(new Student("Shreya", 97));
        list.add(new Student("Rahul", 80));
        list.add(new Student("Anshul", 87));

        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getMarks());
        }
        System.out.println("\n \n \n ");

        // Sorted on the basis of Name

        CompareName compName = new CompareName();
        Collections.sort(list, compName);

        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getMarks());
        }
        System.out.println("\n \n \n ");

        // Sorted on the basis of Marks

        CompareMarks compMarks = new CompareMarks();
        Collections.sort(list, compMarks);

        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getMarks());
        }
    }
}
