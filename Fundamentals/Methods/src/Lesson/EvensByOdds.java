package Lesson;

import java.util.Scanner;

public class EvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = (Math.abs(Integer.parseInt(scan.nextLine())));
        int result = getMultiplication(input);
        System.out.println(result);
    }

    private static int getMultiplication(int input) {
        int evenSum = 0;
        int oddSum = 0;
        while (input > 0) {
            int digit = input % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            input /= 10;
        }
        return evenSum * oddSum;
    }
}
