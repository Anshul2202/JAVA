public class sortStu {

    private String studentName;
    private int studentRollNo;
    private String standard;
    private char section;

    // Constructor Overloading..........

    public sortStu() {
        this.studentName = "DefaultName";
        this.studentRollNo = 0;
        this.standard = "DefaultStandard";
        this.section = '!';
    }

    public sortStu(String studentName, int studentRollNo) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.standard = "DefaultStandard";
        this.section = '!';
    }

    public sortStu(String studentName, int studentRollNo, String standard, char section) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.standard = standard;
        this.section = section;
    }

    // Getter Methods.........

    public void getDetails() {
        System.out.println(this.studentName);
        System.out.println(this.studentRollNo);
        System.out.println(this.standard);
        System.out.println(this.section);
    }
}
