package Lesson;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> infoTable = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            infoTable.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, ArrayList<String>> innerMap = infoTable.get(continent);
            innerMap.putIfAbsent(country, new ArrayList<>());
            innerMap.get(country).add(city);
        }
        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : infoTable.entrySet()) {
            LinkedHashMap<String, ArrayList<String>> innerMap = entry.getValue();
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, ArrayList<String>> innerEntry : innerMap.entrySet()) {
                System.out.println("  " + innerEntry.getKey() + " -> " + String.join(", ", innerEntry.getValue()));

            }
        }
    }
}
