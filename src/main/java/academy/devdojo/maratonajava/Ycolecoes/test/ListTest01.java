package academy.devdojo.maratonajava.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Rodrigo");
        nomes.add("e o melhor programador java");
        nomes2.add("Rodrigo vai ser contratado");
        nomes2.add("por causa desse curso foda.");

        nomes.addAll(nomes2);


        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-------------------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);

        System.out.println(numeros.get(0));
    }
}
