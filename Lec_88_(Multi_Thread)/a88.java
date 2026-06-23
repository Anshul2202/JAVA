public class a88 {
    
    public static void main(String arr[]){

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

    }
}
