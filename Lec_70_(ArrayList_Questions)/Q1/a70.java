import java.util.*;

public class a70 {

    public static void main(String arr[]) {

        ArrayList<Dates> list = new ArrayList<>();

        list.add(new Dates("Anshul", "22-02-2006"));
        list.add(new Dates("Shreya", "13-09-2004"));
        list.add(new Dates("Siddharth", "07-03-2006"));
        list.add(new Dates("Aacharya", "01'12-2006"));

        Collections.sort(list);

        for (Dates d : list) {
            System.out.println(d.getName());
        }
    }
}
