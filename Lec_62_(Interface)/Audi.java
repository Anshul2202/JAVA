public class Audi implements Icar {

    @Override
    public void topSpeed() {
        System.out.println("The top speed of Audi is 200kmph");
    }

    @Override
    public void milage() {
        System.out.println("The milage of Audi is 50");
    }

    @Override
    public void cost() {
        System.out.println("The cost is : 5000000");
    }

    @Override
    public void yearOfManufacture() {
        System.out.println("2020");
    }

    public static void main(String arr[]) {
        Audi audi = new Audi();
        audi.topSpeed();
        audi.cost();
        audi.milage();
        audi.yearOfManufacture();
    }
}
