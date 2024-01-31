package Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class NamesPredicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] names = scan.nextLine().split(" ");
        Predicate<String> predicate = e -> e.length() <= n;
        Arrays.stream(names).forEach(e -> {
            if (predicate.test(e)) {
                System.out.println(e);
            }
        });
    }
}
