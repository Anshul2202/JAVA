public class a9 {
    public static void main(String arr[]) {

        double petrolRate = 84.11;
        double dieselRate = 74.91;

        double totalAmount = 1546.12;

        double totalPetrol = totalAmount / petrolRate;
        double totalDiesel = totalAmount / dieselRate;

        System.out.println(totalPetrol + "L");
        System.out.println(totalDiesel + "L");
    }
}