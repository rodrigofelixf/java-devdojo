package academy.devdojo.maratonajava.ZZGconcorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emailsList = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean emailOpen = true;


    public boolean isOpen() {
        return this.emailOpen;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emailsList.size();
        } finally {
            lock.unlock();
        }
    }


    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Added email in list");
            this.emailsList.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }


    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while (this.emailsList.isEmpty()) {
                if (!emailOpen) return null;
                System.out.println(Thread.currentThread().getName() + " has not emails, mode wait on...");
                condition.await();
            }
            return this.emailsList.poll();
        } finally {
            lock.unlock();
        }


    }

    public void close() {

        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notify All, we not retrieve emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }


}
