package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class wtf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean areBalanced = false;
        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                if (openBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop();
                if (lastOpenBracket == '(' && currentBracket == ')') {
                    areBalanced = true;
                } else if (lastOpenBracket == '{' && currentBracket == '}') {
                    areBalanced = true;
                } else if (lastOpenBracket == '[' && currentBracket == ']') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}