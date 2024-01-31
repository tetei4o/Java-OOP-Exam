package Lesson;

import java.util.Scanner;
import java.util.TreeSet;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> partyMembers = new TreeSet<>();
        String input = scan.nextLine();
        while (!input.equals("PARTY")) {
            partyMembers.add(input);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("END")) {
            partyMembers.remove(input);
            input = scan.nextLine();
        }
        System.out.println(partyMembers.size());
        System.out.println(String.join(System.lineSeparator(), partyMembers));
    }
}
