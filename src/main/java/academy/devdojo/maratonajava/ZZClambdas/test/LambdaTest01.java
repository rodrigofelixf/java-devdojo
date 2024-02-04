package academy.devdojo.maratonajava.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        List<String> strings = List.of("Rodrigo", "Goku", "L", "Naruto");
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        forEach(strings, s -> System.out.println(s));
        forEach(numbers, i-> System.out.println(i));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
