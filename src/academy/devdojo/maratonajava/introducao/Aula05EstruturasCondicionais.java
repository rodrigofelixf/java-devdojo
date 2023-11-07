package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 10;
        boolean isAutorizadoComprarBebida = age >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorized buy alcool");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }

    }
}
