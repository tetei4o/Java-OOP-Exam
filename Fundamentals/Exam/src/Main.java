import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "(['\\/])([A-Z][a-z]{5,})\1";
        Pattern pattern = Pattern.compile(regex);
        String input = scan.nextLine();
        Matcher match = pattern.matcher(input);
        System.out.println(match);
        if (!match.find()) {
            System.out.println("No valid names found!");
        }
    }
}
