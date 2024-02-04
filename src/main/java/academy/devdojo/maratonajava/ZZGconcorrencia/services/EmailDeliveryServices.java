package academy.devdojo.maratonajava.ZZGconcorrencia.services;

import academy.devdojo.maratonajava.ZZGconcorrencia.domain.Members;

public class EmailDeliveryServices implements Runnable {
    private final Members members;

    public EmailDeliveryServices(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Starting to deliver emails");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " send email to " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " send email successful to " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("All email were sent successfully");

    }
}
