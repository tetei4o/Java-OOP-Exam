package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            int[] temp = Arrays
                    .stream(input.split(" "))
                    .mapToInt(value -> Integer.parseInt(value))
                    .toArray();
            if (i % 2 == 0) {
                arrayOne[i] = temp[0];
                arrayTwo[i] = temp[1];
            } else {
                arrayOne[i] = temp[1];
                arrayTwo[i] = temp[0];
            }
        }
        for (int j : arrayOne) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int k : arrayTwo) {
            System.out.print(k + " ");
        }
    }
}
