package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);

        mangas.add(new Manga(3, "Naruto", 2.0));
        mangas.add(new Manga(5, "Pokemon", 6.0));
        mangas.add(new Manga(2, "Attack on Titan", 10.0));
        mangas.add(new Manga(4, "Dragon Ball Gt", 7.0));
        mangas.add(new Manga(1, "Digimon", 1.0));


        mangas.sort(new MangaByIdComparator());
        mangas.forEach(System.out::println);
        Manga mangaToSearch = new Manga(4L, "Dragon Ball Gt", 7.0);
        //pode transformar o MangaByIdCOmparator em uma variavel
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByIdComparator()));


    }
}
