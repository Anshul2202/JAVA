public class grocery {

    private String customerName;
    private int customerId;
    private int customerPhoneNo;
    private int customerAccBal;
    private String customerAdd;

    // Set methods
    public void setName(String name) {
        this.customerName = name;
    }

    public void setId(int id) {
        this.customerId = id;
    }

    public void setPhoneNo(int number) {
        this.customerPhoneNo = number;
    }

    public void setAccBal(int balance) {
        this.customerAccBal = balance;
    }

    public void setAdd(String address) {
        this.customerAdd = address;
    }

    // Get methods
    public void getName() {
        System.out.println(this.customerName);
    }

    public void getId() {
        System.out.println(this.customerId);
    }

    public void getPhoneNo() {
        System.out.println(this.customerPhoneNo);
    }

    public void getAccBal() {
        System.out.println(this.customerAccBal);
    }

    public void getAdd() {
        System.out.println(this.customerAdd);
    }
}
