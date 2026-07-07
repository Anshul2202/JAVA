public class a103 {

    public static void main(String arr[]) {

        // ------------ .matches() -------------
        String s1 = "abc";
        System.out.println(s1.matches("abc"));

        // \d
        String s2 = "9";
        System.out.println(s2.matches("\\d"));

        // \D
        String s3 = "#";
        System.out.println(s3.matches("\\D"));

        // \s
        String s4 = " ";
        System.out.println(s4.matches("\\s"));

        // \S
        String s5 = "A";
        System.out.println(s5.matches("\\S"));

        // \w
        String s6 = "A";
        System.out.println(s6.matches("\\w"));

        // \W
        String s7 = "@";
        System.out.println(s7.matches("\\W"));

        // +
        String s8 = "9999";
        System.out.println(s8.matches("\\d+"));

        // *
        String s9 = "";
        System.out.println(s9.matches("\\d*"));

        // .
        String s10 = "x";
        System.out.println(s10.matches("."));

        // ?
        String s11 = "a";
        System.out.println(s11.matches("ab?"));

        // {}
        String s12 = "999";
        System.out.println(s12.matches("\\d{3}"));
        System.out.println(s12.matches("\\d{3,}"));
        System.out.println(s12.matches("\\d{3,10}"));

        // []
        String s13 = "a";
        System.out.println(s13.matches("[a-z]"));

        String s14 = "abc1987ABC";
        System.out.println(s14.matches("[a-z0-9A-Z]+"));

        // ()
        String s15 = "";
        System.out.println(s15.matches("(ab)?"));

        // |
        String s16 = "dog";
        System.out.println(s16.matches("dog|cat"));

        

    }
}
