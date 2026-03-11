public class a49 {

    public static void main(String arr[]) {

        Complex c1 = new Complex("All in one complex", new Library("ABC LIBRARY", new Floor(5, 1000)));

        c1.getLibrary().getBooks();
        c1.getLibrary().getlibFloor().cleanFloor();
    }
}
