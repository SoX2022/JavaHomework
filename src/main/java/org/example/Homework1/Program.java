package org.example.Homework1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;

public class Program {
    public static void start() {
        Path filePath = Path.of("src", "main", "resources", "Homework1", "notes.txt");
        Path directoryPath = Path.of("src", "main", "resources", "Homework1");
        String text;
        boolean stop = false;

        if (!Files.exists(filePath)) {
            try {
                Files.createDirectories(directoryPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            createFile(filePath);
        }

        while (!stop) {
            text = Decorator.getUserInput("\nEnter your note you want to save\nEnter 'quit' to exit");

            if (!text.equalsIgnoreCase("quit")) {
                saveNote(text, filePath);
            } else {
                stop = true;
            }
        }
    }

    private static void createFile(Path filePath) {
        try {
            Files.createFile(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveNote(String text, Path filePath) {
        try {
            text = new Timestamp(System.currentTimeMillis()) + " -> " + text + "\n";
            Files.write(filePath, text.getBytes(), StandardOpenOption.APPEND);
            Decorator.printResult("Note successfully saved :" + " -> " + text);
        } catch (IOException e) {
            Decorator.printResult("Saving failed");
            e.printStackTrace();
        }
    }
}
