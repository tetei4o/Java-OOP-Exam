package Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        printCharactersInBetween(char1, char2);
    }

    public static void printCharactersInBetween(char char1, char char2) {
        if (char1 < char2) {
            for (int i = char1 + 1; i < char2; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = char2 + 1; i < char1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
