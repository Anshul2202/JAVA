public class MyThread extends Thread{
    
    @Override
    public void run(){

        System.out.println("Thread is created......");

        try{
            Thread.sleep(2000);
            System.out.println("2 sec wait is over!");
        }
        catch(InterruptedException e){
            System.out.println("Interrupted!");
        }

        System.out.println("Done!");
    }
}
