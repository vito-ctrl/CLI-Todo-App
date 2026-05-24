package services;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;

public class FileService {

    public void store (String title, boolean isComplete, LocalDate createdAt) {
        Path path  = Paths.get("/home/vito/java_projects/CLI-Todo-App/src/data/tasks.txt");
        int id = getLastID(path) + 1;

        String data = (id + "   " +
                title + "   " +
                isComplete + "   " +
                createdAt + "\n");

        try {
            Files.writeString(path, data,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private int getLastID(Path path){
        File myObj = new File(path.toUri());
        char c = '1';
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                c = data.charAt(0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        int id = c - '0';
        return id;
    }
}