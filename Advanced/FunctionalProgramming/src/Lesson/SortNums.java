package Lesson;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(value -> Integer.parseInt(value))
                .filter(e -> e % 2 == 0)
                .sorted()
                .toArray();
        System.out.println(Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}
