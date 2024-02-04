package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor. Por exemplo 50

        for (int num = 0; num <= 50; num++) {
            System.out.println(num);
            if (num >=25) break;
        }
    }
}
