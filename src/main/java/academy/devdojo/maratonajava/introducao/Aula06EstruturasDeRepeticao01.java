package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 ate 1000000

        for (int num = 0; num <= 1000000; num++) {
            if (num % 2 == 0 ) {
                System.out.println(num);
            }
        }
    }
}
