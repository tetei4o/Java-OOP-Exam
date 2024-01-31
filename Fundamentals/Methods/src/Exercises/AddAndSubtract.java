package Exercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int result = getResult(num1, num2, num3);
        System.out.println(result);
    }

    static int sumOfFirstTwo(int num1, int num2) {
        return num1 + num2;
    }

    static int getResult(int num1, int num2, int num3) {
        return (sumOfFirstTwo(num1, num2) - num3);
    }
}
