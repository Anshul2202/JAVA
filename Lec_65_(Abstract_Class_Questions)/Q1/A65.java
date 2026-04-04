public class A65 extends Marks {

    int num1;
    int num2;
    int num3;

    @Override
    public void getPercentage() {
        double percentage = (num1 + num2 + num3) / 3;
        System.out.println("The percentage is : " + percentage);
    }

    public A65(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
}
