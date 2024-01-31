package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean hasHappened = false;
        for (int i = 0; i < array.length; i++) {
            int rightSum = 0;
            int leftSum = 0;
            for (int left = 0; left < i; left++) {
                leftSum += array[left];
            }
            for (int right = i + 1; right < array.length; right++) {
                rightSum += array[right];
            }
            if (rightSum == leftSum) {
                System.out.println(i);
                hasHappened = true;
            }

        }
        if (!hasHappened) {
            System.out.println("no");
        }
    }
}
