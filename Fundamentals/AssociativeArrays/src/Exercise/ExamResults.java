package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Integer> namePoints = new HashMap<>();
        Map<String, Integer> languageCount = new HashMap<>();
        while (!input.equals("exam finished")) {
            String[] commands = input.split("-");
            if (commands[1].equals("banned")) {
                namePoints.remove(commands[0]);
            } else {
                if (!namePoints.containsKey(commands[0])) {
                    namePoints.put(commands[0], Integer.parseInt(commands[2]));
                } else {
                    if (Integer.parseInt(commands[2]) >= namePoints.get(commands[0])) {
                        namePoints.replace(commands[0], Integer.parseInt(commands[2]));
                    }
                }
                if (!languageCount.containsKey(commands[1])) {
                    languageCount.put(commands[1], 1);
                } else {
                    languageCount.replace(commands[1], languageCount.get(commands[1]) + 1);
                }
            }
            input = scan.nextLine();
        }
        System.out.println("Results:");

        namePoints.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s | %d\n", e.getKey(), e.getValue()));

        System.out.println("Submissions:");

        languageCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s - %d\n", e.getKey(), e.getValue()));
    }
}

