public class MyThread89 extends Thread{
    Counter c;

    public MyThread89(Counter c){
        this.c = c;
    }
    
    @Override
    public void run(){

        for(int i = 0; i < 10000; i++){
            c.increment();
        }
    }
}
