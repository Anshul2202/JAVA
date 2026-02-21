
public class cellPhone {

    private String model;
    private int price;
    private int ram;

    // Set method

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // Get methods

    public void getModel() {
        System.out.println(this.model);
    }

    public void getPrice() {
        System.out.println(this.price);
    }

    public void getRam() {
        System.out.println(this.ram);
    }
}
