public class a93 {
    
    public static void main(String arr[]){

        lock1 l1 = new lock1();
        lock2 l2 = new lock2();

        MyThread1 t1 = new MyThread1(l1 , l2);
        MyThread2 t2 = new MyThread2(l1 , l2);

        t1.start();
        t2.start();
    }
}
