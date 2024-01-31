package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ESP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] words = new String[n];
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            words[i] = scan.nextLine();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int length = words[i].length();
            for (int j = 0; j < length; j++) {
                int currentChar = words[i].charAt(j);
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    currentChar *= length;
                } else {
                    currentChar /= length;
                }
                sum += currentChar;
            }
            results[i] = sum;
        }
        Arrays.stream(results).sorted().forEach(System.out::println);
    }
}
