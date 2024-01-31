import java.util.Scanner;

public class HalfSumEle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        sum1 = sum - max;
        if (sum1 == max) {
            System.out.printf("Yes\n" + "Sum = %d", max);
        } else {
            int diff = max - sum1;
            System.out.printf("No\n" + "Diff = %d", Math.abs(diff));
        }
    }
}
