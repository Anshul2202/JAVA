public class a33 {

    public static void main(String arr[]) {

        char val = 'a';

        switch (Character.toUpperCase(val)) {

            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Is vowel");
                break;
            default:
                System.out.println("Not a vowel");

        }
    }
}
