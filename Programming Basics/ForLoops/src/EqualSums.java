import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < n * 2; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i < n) {
                rightSum += num;
            } else {
                leftSum += num;
            }
        }
        int diff = rightSum - leftSum;
        if (diff == 0) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            if (diff < 0) {
                System.out.printf("No, diff = %d", diff * -1);
            } else {
                System.out.printf("No, diff = %d", diff);
            }
        }
    }
}
