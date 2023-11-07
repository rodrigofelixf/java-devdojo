package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repository;

public class RepositorioBancoDeDados implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando no banco de Dados");
    }
}
