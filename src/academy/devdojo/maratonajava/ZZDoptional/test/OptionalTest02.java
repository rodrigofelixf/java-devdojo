package academy.devdojo.maratonajava.ZZDoptional.test;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repository;
import academy.devdojo.maratonajava.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("boku no hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaByid = MangaRepository.findById(10L)
                .orElseThrow(IllegalAccessError::new);


        Manga newManga = MangaRepository.findByTitle("Drifeters")
                .orElseGet(() -> new Manga(30L, "Drofeters", 100));

        System.out.println(newManga);
    }
}
