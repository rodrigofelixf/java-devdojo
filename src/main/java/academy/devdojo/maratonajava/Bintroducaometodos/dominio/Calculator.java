package academy.devdojo.maratonajava.Bintroducaometodos.dominio;

public class Calculator {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numb1, int numb2) {
        System.out.println(numb1 * numb2);
    }

    public double divideDoisNumeros(double numb1, double numb2) {
        double resultado = 0;
        if (numb1 != 0 && numb2 != 0) {
            resultado = numb1 / numb2;
        }
        return resultado;
    }

    public void somaArray(int[] numeros) {
        int sum = 0;
        for (int num : numeros) {
            sum += num;
        }
        System.out.println(sum);

    }

    public void somaVarArgs(int... numeros) {
        int sum = 0;
        for (int num : numeros) {
            sum += num;
        }
        System.out.println(sum);
    }
}
