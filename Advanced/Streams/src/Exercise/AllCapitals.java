package Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        Files.readAllLines(Path.of("D:\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"))
                .forEach(line -> {
                    try {
                        writer.write(line.toUpperCase(Locale.ROOT));
                        writer.newLine();
                    } catch (IOException exception) {
                        exception.getCause();
                    }
                });
        writer.flush();
        writer.close();
    }
}
