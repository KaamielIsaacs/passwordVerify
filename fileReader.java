// Kaamiel Isaacs
// Student Number: 4129581
// Practical12.java

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileReader {

    public static void main(String[] args) {
        Path input = Paths.get("Rhyme.txt");
        Path output = Paths.get("rhyme2.txt");

        try (BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8); BufferedWriter writer = Files.newBufferedWriter(output, StandardCharsets.UTF_8)) {

            String line;
            int verse = 1;
            int lines = 0;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);

                if (line.isEmpty()) {
                    verse++;
                    lines = 0;
                    writer.newLine();
                } else {
                    lines++;
                    writer.write("[" + verse + "][" + lines + "]" + line);
                    writer.newLine();
                }
            }

            writer.write("Kaamiel Isaacs");
            writer.newLine();
            writer.write("Student Number: 4129581");
            writer.newLine();

        } catch (NoSuchFileException e) {
            System.err.println("Input file not found: Rhyme.txt");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
