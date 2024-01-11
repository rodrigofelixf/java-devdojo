package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Dconstrutores.domonio.Anime;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> manga = new ArrayList<>(6);

        manga.add(new Manga(3, "Naruto", 2.0));
        manga.add(new Manga(5, "Pokemon", 6.0));
        manga.add(new Manga(2, "Attack on Titan", 10.0));
        manga.add(new Manga(4, "Dragon Ball Gt", 7.0));
        manga.add(new Manga(1, "Digimon", 1.0));

        Collections.sort(manga);


        manga.forEach(System.out::println);

    }
}
