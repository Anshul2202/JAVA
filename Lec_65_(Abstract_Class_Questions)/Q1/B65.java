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

    public B65(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
}
