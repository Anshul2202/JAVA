public class A65 extends Marks {

    int num1;
    int num2;
    int num3;

    @Override
    public void getPercentage() {
        double percentage = (num1 + num2 + num3) / 3;
        System.out.println("The percentage is : " + percentage);
    }

    public A65(int a, int b, int c) {
        num1 = a;
        num2 = b;
        num3 = c;
    }
}
