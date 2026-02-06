public class a27 {

    public static void main(String arr[]) {

        String stuName = "Anshul";
        int stuMarks = 97;

        char stuGrade = getGrade(stuMarks);

        printDetails(stuName, stuGrade);
    }

    public static char getGrade(int marks) {

        if (marks >= 90) {
            return 'A';
        } else if (marks < 90 && marks >= 80) {
            return 'B';
        } else if (marks < 80 && marks >= 70) {
            return 'C';
        } else if (marks < 70 && marks >= 60) {
            return 'D';
        } else if (marks < 60 && marks >= 33) {
            return 'P';
        } else if (marks < 33) {
            return 'F';
        }
        return 0;
    }

    public static void printDetails(String name, char grade) {

        System.out.println("The student name is : " + name);
        System.out.println("The grade is : " + grade);
    }
}
