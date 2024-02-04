package academy.devdojo.maratonajava.Aprojetocomhashcode.test;

import academy.devdojo.maratonajava.Aprojetocomhashcode.domain.Produto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Produto> produtos = new HashSet<>();

        try(Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) {
                System.out.println("SKU: ");
                String sku = entrada.nextLine();

                System.out.println("NOME: ");
                String nome = entrada.nextLine();

                Produto produto = new Produto(sku, nome);
                if (produtos.contains(produto)) {
                    System.err.println("Produto ja adicionado");
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado com sucesso");
                }
                System.out.println("Deseja continuar? S/N? ");
                continuar = entrada.nextLine();
            }

            produtos.forEach(System.out::println);
            System.out.println("FIM");


        }

    }
}