package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SmallestEle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Consumer<List<Integer>> printMin = list -> {
            int min = Integer.MAX_VALUE;
            for (int number : numbers) {
                if (number <= min) {
                    min = number;
                }
            }
            System.out.println(numbers.indexOf(min));
        };
        printMin.accept(numbers);
    }
}
