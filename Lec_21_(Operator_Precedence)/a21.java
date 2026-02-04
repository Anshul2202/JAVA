public class a21 {

    public static void main(String arr[]) {

        // ------- Operator Precedence ---------

        // () ----> Highest
        // * , / , %
        // + , -
        // = ----> Lowest

        int lenght = 10;
        int breadth = 15;

        // int para = 2 * lenght + breadth; // para should be 50

        int para = 2 * (lenght + breadth);
        System.out.println(para);
    }
}
