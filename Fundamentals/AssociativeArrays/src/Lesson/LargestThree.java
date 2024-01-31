package Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Arrays.stream(input)
                .map(Integer::parseInt)
                .sorted((e1, e2) -> e2.compareTo(e1))
                .limit(3)
                .forEach(e -> System.out.print(e + " "));
    }
}
