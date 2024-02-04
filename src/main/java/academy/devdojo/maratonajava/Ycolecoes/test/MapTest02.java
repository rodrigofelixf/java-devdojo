package academy.devdojo.maratonajava.Ycolecoes.test;

import academy.devdojo.maratonajava.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.Ycolecoes.dominio.Manga;

import java.util.*;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rodrigo");
        Consumidor consumidor2 = new Consumidor("Dev Dojo Academy");

        Manga manga1 = new Manga(5L, "Pokemon", 6.0, 2);
        Manga manga2 =new Manga(5L, "Naturo", 6.0,5);
        Manga manga3 =new Manga(2L, "Attack on Titan", 10.0, 1);
        Manga manga4 =new Manga(4L, "Dragon Ball Gt", 7.0,7);
        Manga manga5 =new Manga(1L, "Digimon", 1.0,0);



        Map<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor1, manga4);
        consumidorManga.put(consumidor2, manga1);

        consumidorManga.forEach((consumidor, manga) -> System.out.println(consumidor.getName() + " : " + manga.getName()));

        System.out.println("-------------------");

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }




    }
}
