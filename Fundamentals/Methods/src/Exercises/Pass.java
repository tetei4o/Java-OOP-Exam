package Exercises;

import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        boolean isValidContent = validateContent(pass);
        boolean isValidDigitsCount = validateDigitsCount(pass);
        boolean isValidLength = validateLength(pass);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidDigitsCount) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isValidContent && isValidDigitsCount) {
            System.out.println("Password is valid");
        }
    }

    static boolean validateLength(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    static boolean validateContent(String pass) {
        for (int index = 0; index <= pass.length() - 1; index++) {
            char currentSymbol = pass.charAt(index);
            boolean isSmallLetter = currentSymbol >= 97 && currentSymbol <= 122;
            boolean isCapitalLetter = currentSymbol >= 65 && currentSymbol <= 90;
            boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if (!isSmallLetter && !isCapitalLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }

    static boolean validateDigitsCount(String pass) {
        int countDigits = 0;
        for (int index = 0; index <= pass.length() - 1; index++) {
            char currentSymbol = pass.charAt(index);
            if (Character.isDigit(currentSymbol)) {
                countDigits++;
            }

        }
        return countDigits >= 2;
    }
}


