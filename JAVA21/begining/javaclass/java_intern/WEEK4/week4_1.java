// package WEEK4;
class MyRunnable implements Runnable {
    public void run(){
        try {
            System.out.println("Thread ID:"+Thread.currentThread().getId()+"is running!");
            Thread.sleep(500);
            System.out.println("thread ID:"+Thread.currentThread().getId()+"is awake now!");
        }catch(InterruptedException e){
            System.out.println("thread interupted:"+e.getMessage());
        }
    }
}

public class week4_1 {
    public static void main(String[] args) {
    MyRunnable runnable1 = new MyRunnable();
    MyRunnable runnable2 = new MyRunnable();
    Thread thread1 = new Thread(runnable1);
    Thread thread2 = new Thread(runnable2);
    thread1.start();
    thread2.start();
}
}
