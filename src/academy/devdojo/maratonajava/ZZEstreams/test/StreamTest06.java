package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest06 {
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
        System.out.println(lightNovelList.stream().anyMatch(ln -> ln.getPrice() < 1.89));
        System.out.println(lightNovelList.stream().allMatch(ln -> ln.getPrice() > 1.89));
        System.out.println(lightNovelList.stream().noneMatch(ln -> ln.getPrice() > 0));

        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);


        lightNovelList.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 5)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
