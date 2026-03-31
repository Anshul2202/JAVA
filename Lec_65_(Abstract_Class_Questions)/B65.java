public class B65 extends Marks {

    int num1;
    int num2;
    int num3;
    int num4;

    @Override
    public void getPercentage() {
        double percentage = (num1 + num2 + num3 + num4) / 4;
        System.out.println("The percentage is : " + percentage);
    }

    public B65(int a, int b, int c, int d) {
        num1 = a;
        num2 = b;
        num3 = c;
        num4 = d;
    }
}
