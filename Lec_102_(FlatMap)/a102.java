import java.util.*;

public class a102 {
    
    public static void main(String arr[]){

        List<Integer> list1 = Arrays.asList(1 , 2 , 3);

        List<Integer> list2 = Arrays.asList(4 , 5 , 6);

        List<Integer> list3 = Arrays.asList(7 , 8 , 9);

        List<List<Integer>> listOfLists = Arrays.asList(list1 , list2 , list3);

        listOfLists.stream()
                    .flatMap(x -> x.stream())
                    .forEach(System.out::println);
    }
}
