package academy.devdojo.maratonajava.Zgenerics.test;

import academy.devdojo.maratonajava.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        List<Barco> barcoList = criarArrayGenerico(new Barco("Lancha"));
        System.out.println(barcoList);

    }

//    private static <T> void criarArrayGenerico(T t) {
//        List<T> arrayGenerico = new ArrayList<>();
//        arrayGenerico.add(t);
//        System.out.println(arrayGenerico);
//    }

    private static <T> List<T> criarArrayGenerico(T t) {
        List<T> list = List.of(t);
        return list;
    }
}
