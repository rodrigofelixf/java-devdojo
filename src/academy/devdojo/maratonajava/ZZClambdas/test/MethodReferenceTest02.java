package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.interfaces.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 4050), new Anime("Beserk",
                10), new Anime("One Piece", 1200)));

        AnimeComparators animeComparators = new AnimeComparators();
        animeList.sort(animeComparators::comparatorByEpisodesNoStatic);
        System.out.println(animeList);
    }
}
