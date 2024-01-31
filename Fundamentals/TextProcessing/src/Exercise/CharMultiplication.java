package Exercise;

import java.util.Scanner;

public class CharMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int sum = 0;
        String first = input[0];
        String second = input[1];
        if (first.length() > second.length()) {
            first = input[1];
            second = input[0];
        }
        for (int i = 0; i < first.length(); i++) {
            sum += first.charAt(i) * second.charAt(i);
        }
        for (int i = first.length(); i < second.length(); i++) {
            sum += second.charAt(i);
        }
        System.out.println(sum);
    }
}
