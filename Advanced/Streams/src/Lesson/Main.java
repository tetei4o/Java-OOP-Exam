package Lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        Set<Character> charSet = Set.of(',', '.', '!', '?');
        FileInputStream inputStream = new FileInputStream(String.valueOf(System.in));
        FileOutputStream outputStream = new FileOutputStream(outPath);
        int nextByte = inputStream.read();
        while (nextByte != -1) {
            char currentChar = (char) nextByte;
            if (!charSet.contains(currentChar)) {
                outputStream.write(currentChar);
            }
            nextByte = inputStream.read();
        }
    }
}
