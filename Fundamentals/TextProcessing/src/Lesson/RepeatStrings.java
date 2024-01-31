package Lesson;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        for (String word : words) {
            String repeatedWord = repeatedWord(word, word.length());
            System.out.print(repeatedWord);
        }
    }

    private static String repeatedWord(String word, int numOfReps) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numOfReps; i++) {
            result.append(word);
        }
        return result.toString();
    }
}
