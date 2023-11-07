package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador Gamer", 12000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        tomate.setDataValidade("12/10/2022");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------");
        CalculadoraImposto.calcularImposto(computador);





    }
}
