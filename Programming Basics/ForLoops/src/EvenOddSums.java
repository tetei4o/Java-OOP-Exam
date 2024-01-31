import java.util.Scanner;

public class EvenOddSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        int diff = sum1 - sum2;
        if (diff == 0) {
            System.out.printf("Yes\n" + "Sum = %d", sum1);
        } else {
            if (diff < 0) {
                System.out.printf("No\n" + "Diff = %d", diff * -1);
            } else {
                System.out.printf("No\n" + "Diff = %d", diff);
            }
        }
    }
}
