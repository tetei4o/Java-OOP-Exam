package Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashSet<String> names = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            names.add(scan.nextLine());
        }
        System.out.println(String.join(System.lineSeparator(), names));
    }
}
