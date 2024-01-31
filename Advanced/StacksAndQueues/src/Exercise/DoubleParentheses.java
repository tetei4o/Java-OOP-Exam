package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DoubleParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        ArrayDeque<Character> closeBrackets = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                openBrackets.offer(input.charAt(i));
            } else if (input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
                closeBrackets.push(input.charAt(i));
            }
        }
        if (openBrackets.isEmpty() || closeBrackets.isEmpty()) {
            System.out.println("NO");
            return;
        }
        boolean areBalanced = false;
        while (!openBrackets.isEmpty()) {
            char currentOpenBracket = openBrackets.poll();
            char currentCloseBracket = closeBrackets.pop();
            if (currentOpenBracket == '(' && currentCloseBracket == ')') {
                areBalanced = true;
            } else if (currentOpenBracket == '{' && currentCloseBracket == '}') {
                areBalanced = true;
            } else if (currentOpenBracket == '[' && currentCloseBracket == ']') {
                areBalanced = true;
            } else {
                areBalanced = false;
                break;
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
