package Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] wagons = new int[n];
        for (int i = 0; i < n; i++) {
            wagons[i] = Integer.parseInt(scan.next());
        }
        int sum = 0;
        for (int j : wagons) {
            System.out.print(j + " ");
            sum += j;
        }
        System.out.println();
        System.out.println(sum);
    }
}
