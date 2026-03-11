public class Library {

    private String libName;
    private Floor floor;

    public Library(String name, Floor floor) {
        this.libName = name;
        this.floor = floor;
    }

    // Getter Methods

    public String getLibName() {
        return this.libName;
    }

    public Floor getlibFloor() {
        return this.floor;
    }

    // Some Methods....

    public void getBooks() {
        System.out.println("Getting you books.......");
    }
}
