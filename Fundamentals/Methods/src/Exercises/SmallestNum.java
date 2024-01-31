package Exercises;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int smallest = getSmallestNum(num1, num2, num3);
        System.out.println(smallest);
    }

    public static int getSmallestNum(int num1, int num2, int num3) {
        if (num3 < num2 && num3 < num1) {
            return num3;
        } else {
            return Math.min(num1, num2);
        }
    }
}
