package academy.devdojo.maratonajava.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setName("Bill Gates");
        funcionario1.setAge(67);
        funcionario1.setSalarios(new double[] {1200, 987.32, 2000});
        funcionario1.imprimirDados();



    }
}
