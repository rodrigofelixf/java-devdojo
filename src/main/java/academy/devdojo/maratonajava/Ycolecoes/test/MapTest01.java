package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("teklado", "teclado");
        map.put("mouzze", "mouse");
        map.put("cpf", "12345678");
        map.put("endereco", "Rua das Casas, N do alfabeto numerico");

        System.out.println(map);

        System.out.println("-------------------");


        // pegando chave valor com forEach with lambida.
        map.forEach((key, value) -> System.out.println(key + " : " + value));


        System.out.println("-------------------");

        for (String key: map.keySet()) {
            System.out.println(key);
        }

        System.out.println("-------------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("-------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
