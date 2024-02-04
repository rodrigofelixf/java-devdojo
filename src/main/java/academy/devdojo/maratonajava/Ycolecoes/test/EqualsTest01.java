package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone celular1 = new Smartphone("1ABC1", "Android");
        Smartphone celular2 = new Smartphone("1ABC1", "Android");

        System.out.println(celular1.equals(celular2));

        celular1 = celular2;

        System.out.println(celular1.equals(celular2));

    }
}
