package Arrays;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n < 1 || n > 50) {
            return;
        }
        int[] numbers = new int[n];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < n; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
        System.out.println(numbers[n - 1]);
    }
}
