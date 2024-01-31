package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sequenceLength = 1;
        int maxLength = 0;
        int digit = 0;
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[i] == numbers[j]) {
                    sequenceLength++;
                } else {
                    break;
                }
            }
            if (sequenceLength >= maxLength) {
                maxLength = sequenceLength;
                digit = numbers[i];
            }
            sequenceLength = 1;
        }
        for (int i = 0; i < maxLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
