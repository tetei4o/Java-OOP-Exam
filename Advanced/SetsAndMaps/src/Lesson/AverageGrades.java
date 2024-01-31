package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, ArrayList<Double>> nameGrades = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double average = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).average().orElse(0);
            nameGrades.putIfAbsent(name, new ArrayList<>());
            nameGrades.get(name).add(average);
        }
        for (var entry : nameGrades.entrySet()) {
            for (Double grade : entry.getValue()) {
                System.out.printf("%s is graduated with %s%n", entry.getKey(), grade.toString().trim());
            }
        }
    }
}
