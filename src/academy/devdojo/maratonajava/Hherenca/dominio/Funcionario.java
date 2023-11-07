package academy.devdojo.maratonajava.Hherenca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public double getSalario() {
        return this.salario;
    }

    public Funcionario(String name) {
        super(name);

    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.name + " recebi o salario de " + this.salario);
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
