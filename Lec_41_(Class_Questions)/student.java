public class student {

    private String firstName;
    private String lastName;
    private int marks;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMarks() {
        return marks;
    }

    // Set Methods

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            this.marks = 0;
        }
        this.marks = marks;
    }

    public boolean isPass() {

        if (this.marks >= 33 && this.marks <= 100) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }
}
