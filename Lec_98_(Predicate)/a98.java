import java.util.function.Predicate;

public class a98 {
    
    public static void main(String arr[]){


        Predicate<Integer> p1 = (x) -> (x >= 18);

        System.out.println(p1.test(18));

        // -------------------------------------------
        // isEmpty

        Predicate<String> p2 = (s) -> (s.isEmpty());

        System.out.println(p2.test(""));

        // -------------------------------------------
        // .and()

        Predicate<Integer> p3 = (i) -> (i % 2 == 0);

        Predicate<Integer> bothAnd = p1.and(p3);

        System.out.println(bothAnd.test(20));

        // -------------------------------------------
        // .or()

        Predicate<Integer> bothOr = p1.or(p3);

        System.out.println(bothOr.test(10));

        // -------------------------------------------
        // .negate()

        Predicate<Integer> neg = p1.negate();

        System.out.println(neg.test(12));
    }
}
