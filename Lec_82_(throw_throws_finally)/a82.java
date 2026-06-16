public class a82 {
    
    public static void main(String arr[]){

        // finally

        try{
            System.out.println("A");
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("This will always be executed!");
        }


        // --------------------------------

        // throw

        int age = 15;

        if(age < 18){
            throw new ArithmeticException("Age is less!");
        }

        //---------------------------------

        test();


    }


    // throws

    public static void test() throws ArithmeticException{

        throw new ArithmeticException("Test Error!");
    }
}
