package Lesson;

import java.util.*;

public class WordsSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<String>> dictionary = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();
            if (!dictionary.containsKey(word)) {
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);
                dictionary.put(word, synonymsForCurrentWord);
            } else {
                List<String> synonymsForCurrentWord = dictionary.get(word);
                synonymsForCurrentWord.add(synonym);
                dictionary.put(word, synonymsForCurrentWord);
            }
        }
        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
