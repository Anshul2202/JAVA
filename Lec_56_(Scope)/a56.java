import pack56.b56;

public class a56 {

    public static void main(String arr[]) {

        b56 obj1 = new b56();
        System.out.println(obj1.var1);
        // System.out.println(obj1.var2); ----> Can not access var2 variable because
        // it's private
        // This is the scope of var1 & var2

        obj1.get1();
        // obj1.get2();
        // Can't access get2 method cause it's also private
        // This is the scope of the method get1 & get2

        // Another example

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i); -----> Can not access "i"
        // Beacuse the scope "i" was only within the for loop
    }
}
