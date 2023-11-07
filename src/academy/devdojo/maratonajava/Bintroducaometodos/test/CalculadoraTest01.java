package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.dominio.Calculator;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.somaDoisNumeros();
        calculator.subtraiDoisNumeros();

        calculator.multiplicaDoisNumeros(2, 5);

        System.out.println(calculator.divideDoisNumeros(5, 2));

    }
}
