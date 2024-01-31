package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] field = new int[fieldSize];
        int[] indexes = Arrays
                .stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        for (int ladyBugIndex : indexes) {
            if (ladyBugIndex >= 0 && ladyBugIndex <= field.length - 1) {
                field[ladyBugIndex] = 1;
            }
        }
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            int currentIndex = Integer.parseInt(command[0]);
            int moveBy = Integer.parseInt(command[2]);
            String direction = command[1];

        }
    }
}
