package Part2;

public class Car implements Comparable<Car> {

    private String name;
    private int cost;

    public Car(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }

    // @Override
    // public int compareTo(Car c) {

    // return this.cost - c.cost;
    // }

    @Override
    public int compareTo(Car c) {
        return this.name.compareTo(c.name);
    }
}