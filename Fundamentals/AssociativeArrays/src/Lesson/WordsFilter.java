package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class WordsFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        Arrays.stream(words)
                .filter(e -> e.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
