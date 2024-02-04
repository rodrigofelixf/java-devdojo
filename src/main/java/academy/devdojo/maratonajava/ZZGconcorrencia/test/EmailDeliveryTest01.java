package academy.devdojo.maratonajava.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.ZZGconcorrencia.domain.Members;
import academy.devdojo.maratonajava.ZZGconcorrencia.services.EmailDeliveryServices;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread rodrigo = new Thread(new EmailDeliveryServices(members)," Rodrigo");
        Thread ben = new Thread(new EmailDeliveryServices(members)," Ben Sttiler");

        rodrigo.start();
        ben.start();

        while (true) {
           String email = JOptionPane.showInputDialog("add your Email");
           if (email == null || email.isEmpty()) {
               members.close();
               break;
           }
           members.addMemberEmail(email);

        }

    }



}
