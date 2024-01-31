package Lesson;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = Integer.parseInt(scan.nextLine());
        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printTopHalf(height);
        printBotHalf(height);
    }

    private static void printTopHalf(int height) {
        for (int i = 1; i < height; i++) { //koe chislo se pechata
            printSingleLine(i); //suzdavame metod, koito suzdava edin red s chisloto, koeto pechatame
        }
    }

    private static void printBotHalf(int height) {
        for (int i = height; i > 0; i--) { //koe chislo se pechata
            printSingleLine(i);
        }
    }

    private static void printSingleLine(int length) {
        for (int j = 1; j <= length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
