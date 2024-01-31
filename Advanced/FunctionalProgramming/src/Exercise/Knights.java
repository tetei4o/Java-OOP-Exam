package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Knights {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Consumer<String> print = str -> System.out.println("Sir " + str);
        Arrays.stream(scan.nextLine().split("\\s+"))
                .forEach(print);
    }
}
