package academy.devdojo.maratonajava.Npolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Televisao");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
