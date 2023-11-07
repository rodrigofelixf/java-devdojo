package academy.devdojo.maratonajava.Hherenca.test;

import academy.devdojo.maratonajava.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.Hherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345678-9");
        Pessoa pessoa = new Pessoa("TokoUko Na-Vara");
        pessoa.setCpf("10101010");
        pessoa.setEndereco(endereco);;
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("TacoUcu Na-mihaVara");
        funcionario.setCpf("1010101-2");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        funcionario.imprime();


    }
}
