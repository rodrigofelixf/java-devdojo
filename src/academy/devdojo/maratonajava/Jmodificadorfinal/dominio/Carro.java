package academy.devdojo.maratonajava.Jmodificadorfinal.dominio;

public class Carro {
    private  String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador comprador = new Comprador();




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
