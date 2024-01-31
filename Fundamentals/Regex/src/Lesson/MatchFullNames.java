package Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();
        Matcher matcher = pattern.matcher(input);
        List<String> matched = new ArrayList<>();
        while (matcher.find()) {
            matched.add(matcher.group());
        }
        System.out.println(matched.toString().replaceAll("[\\[\\]]", " "));
    }
}
