package academy.devdojo.maratonajava.ZZGconcorrencia.test;


import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.printf("Thread %s entry a critical session%n", name);
            System.out.printf("%d Threads waiting in queue%n", lock.getQueueLength());
            System.out.printf("Thread %s waiting 2 seconds%n", name);
            Thread.sleep(2_000);
            System.out.printf("Thread %s wait finished%n", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }
}

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);

        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();

    }
}
