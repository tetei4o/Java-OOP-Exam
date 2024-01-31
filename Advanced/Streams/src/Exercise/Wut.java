package Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Wut {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        String line = reader.readLine();
        int sum = 0;
        while (line != null) {
            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                sum += currentChar;
            }
            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
