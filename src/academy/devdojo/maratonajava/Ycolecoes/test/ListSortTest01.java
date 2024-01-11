package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>(6);

        animes.add("Dragon Ball Z");
        animes.add("Naruto");
        animes.add("One Piece");
        animes.add("Death Note");
        animes.add("Attack On Titan");

        for (String anime : animes) {
            System.out.println(anime);
        }

        Collections.sort(animes);
        System.out.println(animes);

    }
}
