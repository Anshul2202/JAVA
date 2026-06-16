public class a81 {
    
    public static void main(String arr[]){

        // Mutli Catch

        try{
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }

        catch(ArithmeticException e){
            System.out.println("Arithmatic Error");
        }

        catch(Exception e){
            System.out.println("Genralized Error");
        }
    }
}
