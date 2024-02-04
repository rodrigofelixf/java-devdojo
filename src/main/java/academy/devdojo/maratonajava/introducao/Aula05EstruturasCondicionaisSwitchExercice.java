package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisSwitchExercice {
    public static void main(String[] args) {
        byte day = 7;

        switch (day) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia ultil");
                break;

            default:
                System.out.println("Opcao Invalida");
                break;
        }
    }
}
