import pack56.b56;

public class a56 {

    public static void main(String arr[]) {

        b56 obj1 = new b56();
        System.out.println(obj1.var1);
        // System.out.println(obj1.var2); ----> Can not access var2 variable because
        // it's private
        // This is the scope of var1 & var2

        obj1.get();

    }
}
