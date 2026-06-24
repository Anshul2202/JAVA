public class MyRunnable87 implements Runnable{
    
    @Override
    public void run(){
        System.out.println("Thread is created....");

        try{
            Thread.sleep(5000);
            System.out.println("5 sec wait is over!");
        }
        catch(InterruptedException e){
            System.out.println("Exception!");
        }
    }
}
