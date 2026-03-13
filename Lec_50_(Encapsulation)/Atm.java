public class Atm {

    private String name;
    private int balance;

    public Atm(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    // Methods

    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("The amount " + amount + " is debited & The remaining balance is " + balance);
    }
}
