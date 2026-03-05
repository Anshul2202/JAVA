package Q3;

public class c43 {

    public static void main(String arr[]) {

        floor f1 = new floor(2.75, 4.0);
        double totalArea = f1.getArea();
        carpet c1 = new carpet(3.5);
        double costPerArea = c1.getCost();

        calc calc1 = new calc();
        double result = calc1.getTotalCost(totalArea, costPerArea);

        System.out.println("Total Cost = " + result);
    }
}
