public class a71 {
    
    public static void main(String arr[]){
        
        // AutoBoxing
        // primitive ----> Wrapper class

        int a =10;
        Integer b = a; // ---> 'b' is an object of wrapper class "Integer" and 'a' is a primitive data type
        System.out.println(b);


        // Unboxing
        // Wrapper class -----> primitive

        Integer c = 20;
        int d = c;  // -----> 'd' is a primitive data type & 'c' is a wrapper class
        System.out.println(d);
    }
}
