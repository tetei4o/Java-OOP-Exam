package Exercises;

import java.util.Scanner;

public class TopNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        printTopNumbers(num);

    }

    private static void printTopNumbers(int num) {
        for (int i = 10; i <= num; i++) {
            if (sumDivisibleByEight(i) && atLeastOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean sumDivisibleByEight(int num) {
        int digitSum = 0;
        while (num > 0) {
            int digit = num % 10;
            digitSum += digit;
            num /= 10;
        }
        return digitSum % 8 == 0;
    }

    private static boolean atLeastOneOddDigit(int num) {
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            if (digit % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
