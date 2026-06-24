public class MyRunnable86 implements Runnable {
    
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is created.......");

        for(int i = 0; i <= 5; i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Some Error Occured!");
            }
        }
    }

}
