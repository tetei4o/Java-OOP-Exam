package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] commands = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < commands[0]; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < commands[1]; i++) {
            stack.pop();
        }
        if (stack.contains(commands[2])) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(stack));
            }
        }
    }
}
