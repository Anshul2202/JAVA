public class MyThread2 extends Thread{
    
    lock1 l1;
    lock2 l2;

    public MyThread2(lock1 l1 , lock2 l2){
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public void run(){

        synchronized(l2){

            System.out.println("Thread 2 has lock 2");

            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("Thread 2 is waiting for lock 1");

            synchronized(l1){
                System.out.println("Thread 2 has lock 1");
            }

     }
    }
}
