package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Double> studentGrade = new LinkedHashMap<>();
        Map<String, Integer> studentGradeCount = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if (!studentGrade.containsKey(name)) {
                studentGrade.put(name, grade);
                studentGradeCount.put(name, 1);
            } else {
                studentGrade.replace(name, studentGrade.get(name) + grade);
                studentGradeCount.replace(name, studentGradeCount.get(name) + 1);
            }
        }
        studentGrade.forEach((key, value) -> studentGrade.replace(key, value / studentGradeCount.get(key)));
        studentGrade.entrySet()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .filter(entry -> entry.getValue() >= 4.50)
                .forEach(entry -> System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()));
    }
}

