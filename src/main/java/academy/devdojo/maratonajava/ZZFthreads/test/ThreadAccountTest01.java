package academy.devdojo.maratonajava.ZZFthreads.test;

import academy.devdojo.maratonajava.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Arruma o codigo lazarento");
            }
        }

    }
    private final Account account = new Account();
    public static void main(String[] args) throws InterruptedException {

        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();

        Thread t1 = new Thread(threadAccountTest01, "Seu Madruga");
        Thread t2 = new Thread(threadAccountTest01, "Julius");


        t1.start();
        t2.start();


    }


    private void withdrawal(int amount) {
        System.out.println(getThreadName() + " esta fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " esta dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " indo sacar o valor");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " Completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }


}
