public class a63 {

    public static void main(String arr[]) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.getOuterDetails();
    }
}
