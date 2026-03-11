public class Complex {

    private String ComplexName;
    private Library library;

    public Complex(String name, Library lib) {
        this.ComplexName = name;
        this.library = lib;
    }

    // Getter Methods

    public String getComplexName() {
        return ComplexName;
    }

    public Library getLibrary() {
        return library;
    }
}
