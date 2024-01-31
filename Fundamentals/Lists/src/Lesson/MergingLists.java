package Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            System.out.print(list1.get(i) + " " + list2.get(i) + " ");

        }
        printTheRest(list1, size);
        printTheRest(list2, size);
    }

    private static void printTheRest(List<Integer> nums, int beginIndex) {
        for (int i = beginIndex; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");

        }
    }
}
