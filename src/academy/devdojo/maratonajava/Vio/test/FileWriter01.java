package academy.devdojo.maratonajava.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("Rodrigo vai ser o melhor programador Java do mundo");
            fw.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
