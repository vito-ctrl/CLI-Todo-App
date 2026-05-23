package services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.time.LocalDate;

class FileService {

    public void store (int id, String title, boolean isComplete, LocalDate createdAt) {
        Path path  = Paths.get("/home/vito/java_projects/CLI-Todo-App/src/data/tasks.txt");

        String data = (id + "   " +
                title + "   " +
                isComplete + "   " +
                createdAt);

        try {
            Files.writeString(path, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}