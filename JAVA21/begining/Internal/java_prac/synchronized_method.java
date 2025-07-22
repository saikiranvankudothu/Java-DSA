class Table {
    synchronized void printTable(int n) { // synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Table t;
    int value;

    MyThread(Table t, int value) {
        this.t = t;
        this.value = value;
    }

    @Override
    public void run() {
        t.printTable(value);
    }
}

public class TestSynchronization2 {
    public static void main(String args[]) {
        Table obj = new Table(); // only one object
        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 100);

        t1.start();
        t2.start();
    }
}
