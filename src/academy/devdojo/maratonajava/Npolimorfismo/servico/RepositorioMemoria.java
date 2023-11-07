package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repository;

public class RepositorioMemoria implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memoria");
    }
}
