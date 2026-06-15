public class a80 {
    
    public static void main(String arr[]){

        int x = 10;
        int y = 0;

        // System.out.println(x/y); ----> Exception

        // LBYL (Look Before You Leap)

        if(y != 0){
            System.out.println(x/y);
        } else{
            System.out.println("Can't divide by 0");
        }


        // -----------------------------------------------

        // EAFP (Easier to Ask for Forgiveness than Permission)

        try{
            System.out.println(x/y);
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
