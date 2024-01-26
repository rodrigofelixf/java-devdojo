package academy.devdojo.maratonajava.ZZEstreams.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(numbers -> numbers % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(numbers -> numbers % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Eleve", "o", "Cosmo", "no seu coracao")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("--------");

        int[] num = {10, 9, 10};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println("--------");


        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {

            lines
                    .filter(l -> l.contains("Java"))
                    .forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
