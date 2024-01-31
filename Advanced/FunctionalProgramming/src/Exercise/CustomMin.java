package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<Integer[], Integer> min = e -> Arrays.stream(e).mapToInt(j -> j).min().orElse(0);
        Integer[] numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(min.apply(numbers));
    }
}
