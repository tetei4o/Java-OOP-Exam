package Lesson;

import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (true) {
            if (input.equals("end")) {
                break;
            }
            String word = input;
            System.out.printf("%s = %s\n", word, reversed(word, word.length()));
            input = scan.nextLine();
        }
    }

    private static String reversed(String word, int length) {
        StringBuilder result = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }
}
