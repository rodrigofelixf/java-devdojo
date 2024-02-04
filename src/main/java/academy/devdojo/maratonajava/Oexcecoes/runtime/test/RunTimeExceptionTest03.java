package academy.devdojo.maratonajava.Oexcecoes.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {

    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo aquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
