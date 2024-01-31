package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        Map<Character, Integer> occurrences = new LinkedHashMap<>();
        for (String s : input) {
            for (int j = 0; j < s.length(); j++) {
                if (!occurrences.containsKey(s.charAt(j))) {
                    occurrences.put(s.charAt(j), 1);
                } else {
                    int temp = occurrences.get(s.charAt(j));
                    occurrences.replace(s.charAt(j), temp + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : occurrences.entrySet()) {
            System.out.printf("%s -> %d\n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }
    }
}
