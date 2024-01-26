package academy.devdojo.maratonajava.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();

        List<String> graphicsDesigners = List.of("Felix", "Jessica", "Josane", "Lula");
        List<String> developers = List.of("Rodrigo Felix", "Waltson Silva", "Alexandre de Morais", "Lex Luthor");
        List<String> students = List.of("Dilma Houssef", "Bolsonaro", "William Buffet", "Karl Marx");

        devDojo.add(graphicsDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> peoples : devDojo) {
            for (String person : peoples) {
                System.out.println(person);
            }

        }

        System.out.println("-----------------");

        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
