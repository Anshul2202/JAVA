package Part3;

public class Animals implements Comparable<Animals> {

    private String name;
    private double height;

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Animals(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // @Override
    // public int compareTo(Animals a) {
    // return (int)(this.height - a.height);
    // }

    @Override
    public int compareTo(Animals a) {
        if (this.name.compareTo(a.name) > 0) {
            return 1;
        } else if (this.name.compareTo(a.name) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
