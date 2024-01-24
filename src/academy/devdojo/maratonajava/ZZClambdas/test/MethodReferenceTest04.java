package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Naruto", 4050), new Anime("Beserk",
                10), new Anime("One Piece", 1200)));

        BiFunction<String, Integer, Anime> animeBiFunction = (name, episodes) -> new Anime(name, episodes);
        BiFunction<String, Integer, Anime> animeBiFunctionMethodReference = Anime::new;

        System.out.println(animeBiFunctionMethodReference.apply("Death  Note", 100));
    }
}
