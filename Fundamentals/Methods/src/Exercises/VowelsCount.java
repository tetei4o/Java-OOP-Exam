package Exercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();
        printVowelCount(input);
    }

    static void printVowelCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            switch (currentSymbol) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
