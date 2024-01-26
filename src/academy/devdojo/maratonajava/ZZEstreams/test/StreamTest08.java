package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
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

       lightNovelList.stream()
               .map(LightNovel::getPrice)
               .filter(price -> price > 3)
               .reduce(Double::sum)
               .ifPresent(System.out::println);

       double sum = lightNovelList.stream()
               .mapToDouble(LightNovel::getPrice)
               .filter(price -> price > 3)
               .sum();

        System.out.println(sum);

    }
}
