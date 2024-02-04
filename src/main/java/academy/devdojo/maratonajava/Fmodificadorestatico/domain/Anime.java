package academy.devdojo.maratonajava.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] episodios;

    // Bloco de inicializacao eh executado quando a JVM caregar a classe
    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe eh criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicializacao e executado
    // 4 - construtor eh executado


   static  {
        System.out.println("Bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }

        for (int episodio: episodios) {
            System.out.print(episodio + " ");
        }
    }
    public Anime() {

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }

        for (int episodio: episodios) {
            System.out.print(episodio + " ");
        }
    }
}
