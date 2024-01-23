package academy.devdojo.maratonajava.ZZClambdas.interfaces;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int comparatorByName(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }

    public static Integer comparatorByEpisodes(Anime e1, Anime e2) {
        return e1.getEpisodes().compareTo(e2.getEpisodes());
    }
}
