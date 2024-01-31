package BasicSyntax;

import java.util.Scanner;

public class SortNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
            System.out.println(Math.max(num2, num3));
            System.out.println(Math.min(num2, num3));
        } else if (num2 > num3) {
            System.out.println(num2);
            System.out.println(Math.max(num1, num3));
            System.out.println(Math.min(num1, num3));
        } else {
            System.out.println(num3);
            System.out.println(Math.max(num2, num1));
            System.out.println(Math.min(num2, num1));
        }
    }
}
