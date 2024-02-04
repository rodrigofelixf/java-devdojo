package academy.devdojo.maratonajava.ZZDoptional.repository;

import academy.devdojo.maratonajava.ZZDoptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1L, "boku no hero", 50), new Manga(10L, "Overlord", 25) );


    public static Optional<Manga> findById(Long id) {
        return findBy(manga -> manga.getId().equals(id));
    }
   public static Optional<Manga> findByTitle(String title) {
       return findBy(manga -> manga.getTitle().equals(title));
   }


    private static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);

    }



}
