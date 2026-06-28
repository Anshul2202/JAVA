public class a94 {
    
    public static void main(String arr[]){

        Car94 car = () -> {
            System.out.println("Car runs");
        };

        car.run();


        Adder94 a = (int x , int y) -> {
            return (x + y);
        };

        System.out.println(a.add(10 , 10));
    }
}
