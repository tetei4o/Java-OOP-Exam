package Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfEle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(n);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(m);
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            set1.add(number);
        }
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(scan.nextLine());
            set2.add(number);
        }
        set1.retainAll(set2);
        for (int number : set1) {
            System.out.print(number + " ");
        }
    }
}
