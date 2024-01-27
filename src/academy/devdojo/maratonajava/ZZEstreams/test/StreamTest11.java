package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest11 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));


        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);


        System.out.println(lightNovelList.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));


        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect);
        System.out.println(collect.getMax());
        System.out.println(collect.getMin());
        System.out.println(collect.getAverage());
        System.out.println(collect.getSum());
        System.out.println(collect.getCount());


        String titles = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));

        System.out.println(titles);

    }
}
