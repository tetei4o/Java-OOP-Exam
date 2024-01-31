package Lesson;

import java.util.Scanner;

public class LettersDigitsOthers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                digits.append(currentSymbol);
            } else if (Character.isAlphabetic(currentSymbol)) {
                letters.append(currentSymbol);
            } else {
                symbols.append(currentSymbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(symbols.toString());
    }
}
