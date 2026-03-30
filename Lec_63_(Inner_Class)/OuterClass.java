public class OuterClass {

    private int num = 10;

    public void func() {
        System.out.println("Func was called!");
    }

    public class InnerClass {

        public void getOuterDetails() {
            System.out.println(num);
            func();
        }
    }

}
