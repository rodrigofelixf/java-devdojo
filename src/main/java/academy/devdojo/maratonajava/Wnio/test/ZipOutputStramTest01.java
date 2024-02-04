package academy.devdojo.maratonajava.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStramTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta/subpasta");
        zip(arquivoZip, arquivosParaZipar);

    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (ZipOutputStream zipStram = new ZipOutputStream(Files.newOutputStream(arquivoZip))) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar);
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStram.putNextEntry(zipEntry);
                Files.copy(file, zipStram);
                zipStram.closeEntry();

            }
            System.out.println("Successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

