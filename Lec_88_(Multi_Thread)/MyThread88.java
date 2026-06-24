public class MyThread88 extends Thread{
    
    @Override
    public void run(){
        System.out.println("Thread is creadted");

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
}
