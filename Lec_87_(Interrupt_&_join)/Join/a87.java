public class a87 {
    
    public static void main(String arr[]){

        MyRunnable r1 = new MyRunnable();

        Thread t1 = new Thread(r1);

        t1.start();

        // To make the main thread wait for the execution of t1 we use join
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Done!");
    }
}
