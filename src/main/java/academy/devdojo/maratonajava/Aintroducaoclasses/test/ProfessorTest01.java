package academy.devdojo.maratonajava.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];

        printNomes("ROdrigo", "Jessica");


    }

    static void printNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }


}
