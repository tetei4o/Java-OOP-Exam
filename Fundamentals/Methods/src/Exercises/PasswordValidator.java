package Exercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (!isValidLength(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!hasValidChars(input.toLowerCase())) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!hasEnoughDigits(input)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength(input) && hasEnoughDigits(input) && hasValidChars(input.toLowerCase())) {
            System.out.println("Password is valid");
        }
    }

    static boolean isValidLength(String input) {
        return (input.length() >= 6 && input.length() <= 10);
    }

    static boolean hasValidChars(String input) {
        //97-122 for letters
        //48-57 for numbers
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isLetter = currentChar >= 97 && currentChar <= 122;
            boolean isDigit = currentChar >= 48 && currentChar <= 57;
            if (!isLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }

    static boolean hasEnoughDigits(String input) {
        int digitCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 48 && input.charAt(i) < 57) {
                digitCount++;
            }
        }
        return (digitCount >= 2);
    }
}
