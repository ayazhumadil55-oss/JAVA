
class MyRunnable implements Runnable {
    private final String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " басталды");

        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " -> " + i);
            try {
                Thread.sleep(500); // 0.5 секунд күту
            } catch (InterruptedException e) {
                System.out.println(threadName + " тоқтатылды");
            }
        }

        System.out.println(threadName + " аяқталды");
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " басталды");

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " -> " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(getName() + " тоқтатылды");
            }
        }

        System.out.println(getName() + " аяқталды");
    }
}

// Негізгі класс
public class Main {
    public static void main(String[] args) {

        // Runnable арқылы
        Thread t1 = new Thread(new MyRunnable("Runnable-1"));
        Thread t2 = new Thread(new MyRunnable("Runnable-2"));

        // Thread арқылы
        MyThread t3 = new MyThread("Thread-1");
        MyThread t4 = new MyThread("Thread-2");

        // Ағындарды іске қосу
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}


