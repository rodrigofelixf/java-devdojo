package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static  List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara",8.99),
            new LightNovel("Overlord",3.99),
            new LightNovel("Violet Evergarden",5.99),
            new LightNovel("No Game no life",2.99),
            new LightNovel("Fullmetal Alchemist",5.99),
            new LightNovel("Kumo desuga",1.99),
            new LightNovel("Monogatari",4.99)
    ));
    public static void main(String[] args) {
        lightNovelList.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovelList);

        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel: lightNovelList) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() == 3) {
                break;
            }

        }

        System.out.println(titles);



    }
}
