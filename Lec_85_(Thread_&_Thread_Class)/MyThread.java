public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " is created...............");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Some Error occured!");
        }

        System.out.println("5 sec is passed!");

    }
}
