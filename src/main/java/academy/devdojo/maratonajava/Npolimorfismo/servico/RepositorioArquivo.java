package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repository;

public class RepositorioArquivo implements Repository {
    @Override
    public void save() {
        System.out.println("Sallvando em um arquivo");
    }
}
