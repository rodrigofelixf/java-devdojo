package academy.devdojo.maratonajava.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatSring(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo de execucao " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatSringBuilder(1000000);
        fim = System.currentTimeMillis();
        System.out.println("tempo de execucao StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatSringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("tempo de execucao StringBuffer " + (fim - inicio) + "ms");


    }

    private static void concatSring(int tamanho) {
        String text = "";
        for (int i = 0; i < tamanho; i++) {
            text += i;
        }
    }

    private static void concatSringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatSringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }


}


