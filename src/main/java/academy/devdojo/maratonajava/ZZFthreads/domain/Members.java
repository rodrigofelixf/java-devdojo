package academy.devdojo.maratonajava.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emailsList = new ArrayBlockingQueue<>(10);
    private boolean emailOpen = true;


    public boolean isOpen() {
        return this.emailOpen;
    }

    public int pendingEmails() {
        synchronized (emailsList) {
            return emailsList.size();
        }
    }


    public void addMemberEmail(String email) {
        synchronized (this.emailsList) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Added email in list");
            this.emailsList.add(email);
            this.emailsList.notifyAll();

        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (emailsList) {
            while (this.emailsList.isEmpty()) {
                if (!emailOpen) return null;
                System.out.println(Thread.currentThread().getName() + " no has emails, mode wait on...");
                this.emailsList.wait();
            }
            return this.emailsList.poll();

        }
    }

    public void close() {
        emailOpen = false;
        synchronized (this.emailsList) {
            System.out.println(Thread.currentThread().getName() + " Notify All, we not retrieve emails");
        }
    }


}
