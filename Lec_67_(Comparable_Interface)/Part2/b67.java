package Part2;

import java.util.*;

public class b67 {

    public static void main(String arr[]) {

        LinkedList<Car> cars = new LinkedList<>();

        cars.add(new Car("BMW", 5000000));
        cars.add(new Car("Audi", 4000000));
        cars.add(new Car("Swift", 1000000));
        cars.add(new Car("Nano", 500000));

        Collections.sort(cars);

        for (Car c : cars) {
            System.out.println(c.getName() + " " + c.getCost());
        }
    }
}
