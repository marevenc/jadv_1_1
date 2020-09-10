class MyThread extends Thread implements Runnable {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Я поток " + this.getName() + ". Всем привет!");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Поток " + this.getName() + " остановлен");
                break;
            }
        }
    }
}

