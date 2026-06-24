public class Counter {
    int count = 0;

    // Commonly Shared Resource 
    public synchronized void increment(){
        count++;
    }
    
}
