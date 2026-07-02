import java.util.*;
import java.util.stream.Collectors;

public class a100 {
    
    public static void main(String arr[]){

        List<Integer> list = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6);

        // -------------------- Soruce -------------------------

        // .stream() 
        list.stream();

        // --------------- Intermediate Operations -------------

        // .filter()
        list.stream()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);

        // .map
        list.stream()
            .map(x -> x * 10)
            .forEach(System.out::println);
        
        // .distinct()
        list.stream()
            .distinct()
            .forEach(System.out::println);

        // .sorted()
        list.stream()
            .sorted()
            .forEach(System.out::println);

        // .limit()
        list.stream()
            .limit(3)
            .forEach(System.out::println);

        // .skip()
        list.stream()
            .skip(2)
            .forEach(System.out::println);



        // ----------------- Terminal Operations ------------------

        // .forEach()
        list.stream()
            .map(x -> x * 10)
            .forEach(System.out::println);

        // .collect()
        List<Integer> ans = list.stream()
                                .filter(x -> x > 2)
                                .collect(Collectors.toList());

        System.out.println(ans);
    }
}
