package Q2;

public class S1 extends Student {

    String name;
    double percentage;

    public S1(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    // Implementing Abstract methods
    @Override
    public void studentName() {
        System.out.println("The student name is : " + name);
    }

    @Override
    public void getDetails() {
        System.out.println("The percentage is : " + percentage);
    }
}
