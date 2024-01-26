package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static  List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No Game no life",2.99),
            new LightNovel("Fullmetal Alchemist",5.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Monogatari",4.00)
    ));
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovelList.stream();
        lightNovelList.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();

        System.out.println(count);




    }
}
