public class OuterClass {

    private int num = 10;

    public void func() {
        System.out.println("Func was called!");
    }

    public class InnerClass {

        public void getOuterDetails() {

            // Variable & Method of outer class
            // Can be accessed in inner class
            System.out.println(num);
            func();
        }
    }

}
