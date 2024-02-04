package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmarthphoneTest01 {
    public static void main(String[] args) {
        Smartphone celular1 = new Smartphone("1ABC1", "Android");
        Smartphone celular2 = new Smartphone("1010", "Xiaomi");
        Smartphone celular3 = new Smartphone("101010", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(celular1);
        smartphones.add(celular2);
        smartphones.add(0, celular3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone celular4 = new Smartphone("1010", "Pixel");

        System.out.println(smartphones.contains(celular4));
        int indexSmarthphone4 = smartphones.indexOf(celular4);

        System.out.println(smartphones.get(indexSmarthphone4));
        

    }
}
