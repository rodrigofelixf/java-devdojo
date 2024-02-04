package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Pokemon", 6.0, 2));
        mangas.add(new Manga(5L, "Naturo", 6.0,5));
        mangas.add(new Manga(2L, "Attack on Titan", 10.0, 1));
        mangas.add(new Manga(4L, "Dragon Ball Gt", 7.0,7));
        mangas.add(new Manga(1L, "Digimon", 1.0,0));
        mangas.add(new Manga(1L, "Digimon", 1.0,0));

        mangas.forEach(System.out::println);
    }
}
