package academy.devdojo.maratonajava.Minterfaces.test;

import academy.devdojo.maratonajava.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.load();
        databaseLoader.load();
        databaseLoader.remove();
    }
}
