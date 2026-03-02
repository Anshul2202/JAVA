public class cons {

    // Defining constructor

    public cons() {
        System.out.println("Default Construcutor was called...");
    }

    // Constructor OverLoading.....

    public cons(String name, String phoneNo, int marks) {
        System.out.println("Defined Constructor was called....");
        this.name = name;
        this.phoneNo = phoneNo;
        this.marks = marks;
    }

    private String name;
    private String phoneNo;
    private int marks;

    public void getDetails() {
        System.out.println(this.name);
        System.out.println(this.phoneNo);
        System.out.println(this.marks);
    }
}
