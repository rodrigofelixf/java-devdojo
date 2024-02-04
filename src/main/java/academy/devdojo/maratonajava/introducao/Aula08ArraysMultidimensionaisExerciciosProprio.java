package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionaisExerciciosProprio {
    public static void main(String[] args) {

        // Exercício 1: Soma de Matrizes
        //
        //Crie um programa que realize a soma de duas matrizes e armazene o resultado em uma terceira matriz.

        int[][] numeros1 = {{1, 2, 3} , {4, 5, 6}};
        int[][] numeros2 = {{1, 2, 3} , {4, 5, 6}};
        int[][] matrizSoma = new int[2][3];


        for (int i = 0; i < numeros1.length ; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
                matrizSoma[i][j] = numeros1[i][j] + numeros2[i][j];
            }

        }

        for (int i = 0; i < matrizSoma.length; i++) {
            for (int j = 0; j < matrizSoma[i].length; j++){
                System.out.println(matrizSoma[i][j]);
            }
        }


    }
}

