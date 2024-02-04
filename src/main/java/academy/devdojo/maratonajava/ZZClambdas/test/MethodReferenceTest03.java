package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.interfaces.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Coxinha", "Doquinha", "Alma de gato"));
        System.out.println(list);

        list.sort(String::compareTo);
        System.out.println(list);

        BiPredicate<List<String>, String> containsName = List::contains;

        System.out.println(containsName.test(list, "Doquinha"));
    }
}
