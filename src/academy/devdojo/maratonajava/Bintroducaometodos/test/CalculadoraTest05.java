package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.dominio.Calculator;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();

        int[] numeros = {1, 2, 3, 4, 5};

        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
