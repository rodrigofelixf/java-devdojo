package academy.devdojo.maratonajava.ZZEstreams.test;

import academy.devdojo.maratonajava.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.ZZEstreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryLightNovels = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()) {
                case FANTASY: fantasy.add(lightNovel); break;
                case DRAMA: drama.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        categoryLightNovels.put(Category.DRAMA, drama );
        categoryLightNovels.put(Category.FANTASY, fantasy );
        categoryLightNovels.put(Category.ROMANCE, romance );

        System.out.println(categoryLightNovels);

        System.out.print("---------");

        Map<Category, List<LightNovel>> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(collect);


    }
}
