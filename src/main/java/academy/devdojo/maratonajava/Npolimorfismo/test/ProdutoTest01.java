package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador Gamer", 12000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao televisao = new Televisao("Tv 50\" ",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------");

        CalculadoraImposto.calcularImposto(televisao);
        System.out.println("--------------");

    }
}
