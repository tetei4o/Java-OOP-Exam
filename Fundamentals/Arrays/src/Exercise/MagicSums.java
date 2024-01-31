package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                if (array[i] + array[j] == n) {
                    System.out.printf("%d %d\n", array[i], array[j]);
                }
            }
        }
    }
}
