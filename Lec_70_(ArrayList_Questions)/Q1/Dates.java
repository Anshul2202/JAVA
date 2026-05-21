public class Dates implements Comparable<Dates> {

    private String Name;
    private String date;

    public Dates(String Name, String date) {
        this.Name = Name;
        this.date = date;

    }

    public String getName() {
        return Name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int compareTo(Dates d) {
        if ((this.date.compareTo(d.date)) > 0) {
            return 1;
        } else if ((this.date.compareTo(d.date)) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
