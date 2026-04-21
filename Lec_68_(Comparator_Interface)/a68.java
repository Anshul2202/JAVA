import java.util.*;

public class a68 {

    public static void main(String arr[]) {

        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("Gggggggg", 1970, 8.7));
        list.add(new Movie("Ccccccc", 2001, 6.6));
        list.add(new Movie("Kkkkkkkk", 1945, 9.6));
        list.add(new Movie("Aaaaaaa", 2006, 8.6));

        // ------------------------------

        System.out.println("Sorting on the basis of Name \n");

        compareName compName = new compareName();
        Collections.sort(list, compName);

        for (Movie m : list) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }

        // -------------------------------

        System.out.println(" \n \nSorting on the basis of Year \n");

        compareYear compYear = new compareYear();
        Collections.sort(list, compYear);

        for (Movie m : list) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }

        // -------------------------------

        System.out.println(" \n \nSorting on the basis of Rating \n");

        compareRating compRating = new compareRating();
        Collections.sort(list, compRating);

        for (Movie m : list) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}
