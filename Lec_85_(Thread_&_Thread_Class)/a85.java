public class a85 {
    
    public static void main(String arr[]){

        System.out.println("Start");

        MyThread t1 = new MyThread();
        t1.setName("Thread 1");
        
        t1.start();

        System.out.println("Stop!");

        // The execution order is not fixed 
    }
}
