package Lesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] command = scan.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (int i = command.length - 1; i >= 0; i--) {
            stack.push(command[i]);
        }
        while (stack.size() > 1) {
            int left = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int right = Integer.parseInt(stack.pop());
            int result = operator.equals("+")
                    ? left + right
                    : left - right;
            stack.push(String.valueOf(result));
        }
        System.out.println(stack.pop());
    }
}
