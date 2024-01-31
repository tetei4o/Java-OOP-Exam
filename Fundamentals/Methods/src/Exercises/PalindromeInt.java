package Exercises;

import java.util.Scanner;

public class PalindromeInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")) {
            String num = input;
            System.out.println(isPalindrome(num));
            input = scan.nextLine();
        }
    }

    static boolean isPalindrome(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
