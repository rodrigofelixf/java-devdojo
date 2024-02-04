package academy.devdojo.maratonajava.Npolimorfismo.test;

import academy.devdojo.maratonajava.Npolimorfismo.repositorio.Repository;
import academy.devdojo.maratonajava.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repository repositoryDB = new RepositorioBancoDeDados();
        Repository repositoryMemoria = new RepositorioArquivo();

        repositoryDB.save();
        repositoryMemoria.save();
    }
}
