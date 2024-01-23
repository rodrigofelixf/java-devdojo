package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.interfaces.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest03 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 4050), new Anime("Beserk",
                10), new Anime("One Piece", 1200)));
        animeList.sort(AnimeComparators::comparatorByEpisodes);
        System.out.println(animeList);

        System.out.println("----------------");
        animeList.sort(AnimeComparators::comparatorByName);
        System.out.println(animeList);

    }
}
