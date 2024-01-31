package Lesson;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class NamesAges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
        for (int i = n; i > 0; i--) {
            String input = scan.nextLine();
            people.put(input.split(", ")[0], Integer.parseInt(input.split(", ")[1]));
        }
        String condition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String toPrint = scan.nextLine();
        Predicate<Map.Entry<String, Integer>> filtering = getPredicate(condition, age);
        people.entrySet()
                .stream()
                .filter(filtering)
                .forEach(e -> {
                    if (toPrint.equals("name")) {
                        System.out.println(e.getKey());
                    } else if (toPrint.equals("age")) {
                        System.out.println(e.getValue());
                    } else {
                        System.out.println(e.getKey() + " - " + e.getValue());
                    }
                });
    }

    private static Predicate<Map.Entry<String, Integer>> getPredicate(String condition, int age) {
        if (condition.equals("older")) {
            return e -> e.getValue() >= age;
        } else {
            return e -> e.getValue() <= age;
        }
    }
}
