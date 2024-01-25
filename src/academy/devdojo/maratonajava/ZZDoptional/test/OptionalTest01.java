package academy.devdojo.maratonajava.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Rodrigo vai ser o melhor programador java");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------");
        Optional<String> nameOptional = findName("Rodrigo");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));


    }

    private static Optional<String> findName(String name) {
        List<String> listName = List.of("Rodrigo", "William", "Kakaroto");
        int i = listName.indexOf(name);
        if (i != -1 ) {
            return Optional.of(listName.get(i));
        }
        return Optional.empty();
    }
}
