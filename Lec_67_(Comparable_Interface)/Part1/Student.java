package Part1;

public class Student implements Comparable<Student> {

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // With this code Sorting can be done

    // Sorting on the basis of name

    // @Override
    // public int compareTo(Student s) {

    // if (this.name.compareTo(s.name) == 0) {
    // return 0;
    // } else if (this.name.compareTo(s.name) > 0) {
    // return 1;
    // } else {
    // return -1;
    // }

    // }

    // Sorting on the basis of marks

    @Override
    public int compareTo(Student s) {
        return s.marks - this.marks;
    }
}
