package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteretorTest01 {
    public static void main(String[] args) {
        List<Manga> manga = new ArrayList<>(6);
        manga.add(new Manga(5L, "Pokemon", 6.0, 2));
        manga.add(new Manga(5L, "Naturo", 6.0,5));
        manga.add(new Manga(2L, "Attack on Titan", 10.0, 1));
        manga.add(new Manga(4L, "Dragon Ball Gt", 7.0,7));
        manga.add(new Manga(1L, "Digimon", 1.0,0));

//        Iterator<Manga> mangaInterator = manga.iterator();
//        while (mangaInterator.hasNext()) {
//            if (mangaInterator.next().getQuant() == 0) {
//                mangaInterator.remove();
//            }
//        }
        manga.removeIf(manga1 -> manga1.getQuant() == 2 );
        System.out.println(manga);

    }
}


