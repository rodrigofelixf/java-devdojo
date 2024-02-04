package academy.devdojo.maratonajava.ZZFthreads.test;


import java.util.ArrayList;
import java.util.List;

class ThreadSafeNames {
    private List<String> threadSafeNames = new ArrayList<>();

    public synchronized void add(String name) {
        this.threadSafeNames.add(name);
    }


    public synchronized void removeFirst() {
        if (!threadSafeNames.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(threadSafeNames.remove(0));
        }
    }


}
public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Pablo Marcal");

        Runnable r = (threadSafeNames::removeFirst);
        new Thread(r).start();
        new Thread(r).start();

    }
}
