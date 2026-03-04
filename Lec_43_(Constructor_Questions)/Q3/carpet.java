package Q3;

public class carpet {
    private double cost;

    public carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public String getCost() {
        return ("Cost = " + this.cost);
    }
}
