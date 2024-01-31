package Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
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
