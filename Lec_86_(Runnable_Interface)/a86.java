public class a86 {
    
    public static void main(String arr[]){

        MyRunnable86 r1 = new MyRunnable86();

        Thread t1 = new Thread(r1);
        t1.setName("Runnable Thread 1");

        
        t1.start();
    }
}
