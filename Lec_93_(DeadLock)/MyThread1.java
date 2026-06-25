public class MyThread1 extends Thread {
    
    lock1 l1;
    lock2 l2;

    public MyThread1(lock1 l1 , lock2 l2){
        this.l1 = l1;
        this.l2 = l2;        
    }


    @Override
    public void run(){

        synchronized(l1){

            System.out.println("Thread 1 has lock 1");

            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("Thread 1 is waiting for lock 2");


            // Reason for DeadLock
            synchronized(l2){
                System.out.println("Thread 1 has lock 2");
            }
        }
    }
}
