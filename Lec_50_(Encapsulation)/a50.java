public class a50 {

    public static void main(String arr[]) {

        Atm atm1 = new Atm("Anshul", 10000);
        System.out.println(atm1.getName());
        System.out.println(atm1.getBalance());

        atm1.withdraw(9000);

    }
}