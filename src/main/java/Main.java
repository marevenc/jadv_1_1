import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("main group");

        final Thread myThread1 = new Thread(group, new MyThread("1"));
        final Thread myThread2 = new Thread(group, new MyThread("2"));
        final Thread myThread3 = new Thread(group, new MyThread("3"));
        final Thread myThread4 = new Thread(group, new MyThread("4"));

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        try {
            sleep(15000);
            group.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Потоки остановлены");
        }



    }
}
