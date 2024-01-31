package Course;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stringArray = scan.nextLine().split(" ");
        int[] intArray = Arrays.stream(stringArray)
                .mapToInt(Integer::parseInt)
                .toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int j : intArray) {
            if (j % 2 == 0) {
                evenSum += j;
            } else {
                oddSum += j;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
