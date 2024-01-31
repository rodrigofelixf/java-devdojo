package academy.devdojo.maratonajava.ZZGconcorrencia.domain;

public class Account {
    private int balance = 50;


    public int getBalance() {
        return this.balance;
    }


    public void withdrawal(int amount) {
        balance = this.balance - amount;

    }
}
