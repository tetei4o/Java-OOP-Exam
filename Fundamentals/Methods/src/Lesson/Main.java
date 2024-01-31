package Lesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        printSum(a, b);
    }

    public static void printSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
