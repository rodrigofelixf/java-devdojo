package academy.devdojo.maratonajava.Vio.test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("Path Absolute " + file.getAbsolutePath());
            System.out.println("is Directory " + file.isDirectory());
            System.out.println("is File " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
