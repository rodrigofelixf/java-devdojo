package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {


    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);


        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Pokemon", 6.0, 2));
        mangas.add(new Manga(5L, "Naturo", 6.0,5));
        mangas.add(new Manga(2L, "Attack on Titan", 10.0, 1));
        mangas.add(new Manga(4L, "Dragon Ball Gt", 7.0,7));
        mangas.add(new Manga(1L, "Digimon", 1.0,0));
        mangas.add(new Manga(1L, "Digimon", 1.0,0));

        mangas.forEach(System.out::println);

    }
}
