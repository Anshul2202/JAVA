public class staticInit {

    final static String name;

    static {
        name = "Anshul";
        System.out.println("First static initialization is done!");
    }

    public staticInit() {
        System.out.println("Constructor was called!");
    }

    static {
        System.out.println("second static initialization is done!");
    }

    public void method1() {
        System.out.println("Method1 was called!");
    }

    static {
        System.out.println("Third static initialization is done!");
    }

    public void method2() {
        System.out.println("Method2 was called!");
    }

    static {
        System.out.println("Fourth static initialization is done!");
    }

    public void method3() {
        System.out.println("Method3 was called!");
    }
}
