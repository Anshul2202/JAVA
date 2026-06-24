public class a89 {
    
    public static void main(String arr[])throws InterruptedException{

        Counter c = new Counter();
        
        MyThread89 t1 = new MyThread89(c);
        MyThread89 t2 = new MyThread89(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
