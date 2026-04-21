import java.util.*;

public class Movie implements Comparator<Movie> {

    private String name;
    private int year;
    private double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compare(Movie m1, Movie m2) {
        return 0;
    }
}
