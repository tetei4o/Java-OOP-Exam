package Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<Character, Integer> text = new TreeMap<>();
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            text.putIfAbsent(currentCharacter, 0);
            text.put(currentCharacter, text.get(currentCharacter) + 1);
        }
        for (Map.Entry<Character, Integer> entry : text.entrySet()) {
            System.out.printf("%c: %d time/s\n", entry.getKey(), entry.getValue());
        }
    }
}
