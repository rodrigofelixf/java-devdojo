package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionaisExercice {
    public static void main(String[] args) {

        double salary = 2;

        if (salary >= 34713.0 && salary <= 68507.0) {
            System.out.println("Voce vai pagar uma taxa de 37.35%");
        } else if (salary >= 68508.0) {
            System.out.println("Voce vai pagar uma taxa de 49.5%");
        } else {
            System.out.println("Voce vai pagar uma taxa de 9.7");
        }


    }
}
