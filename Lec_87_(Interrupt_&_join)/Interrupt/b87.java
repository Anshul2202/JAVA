public class b87 {
    
    public static void main(String arr[]){

        MyThread87 t1 = new MyThread87();

        t1.start();

        // to send interrupt signals to thread t1 we use .interrupt() method
        t1.interrupt();

        System.out.println("Completed!");
    }
}
