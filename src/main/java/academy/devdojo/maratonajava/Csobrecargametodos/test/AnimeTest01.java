package academy.devdojo.maratonajava.Csobrecargametodos.test;

import academy.devdojo.maratonajava.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Jiraya", "TV", 12, "comedia");


        anime.imprime();
    }
}
