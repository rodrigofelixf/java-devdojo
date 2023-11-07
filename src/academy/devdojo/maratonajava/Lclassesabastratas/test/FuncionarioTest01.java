package academy.devdojo.maratonajava.Lclassesabastratas.test;

import academy.devdojo.maratonajava.Lclassesabastratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.Lclassesabastratas.dominio.Funcionario;
import academy.devdojo.maratonajava.Lclassesabastratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
    }


}
