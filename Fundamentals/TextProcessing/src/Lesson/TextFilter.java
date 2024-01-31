package Lesson;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                StringBuilder wordInStars = new StringBuilder();
                for (int i = 0; i < bannedWord.length(); i++) {
                    wordInStars.append("*");
                }
                text = text.replaceAll(bannedWord, wordInStars.toString());
            }
        }
        System.out.println(text);
    }
}
