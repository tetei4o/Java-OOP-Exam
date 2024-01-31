import java.util.Scanner;

public class DivideNoRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num % 2 == 0) {
                p1 += 1;
            }
            if (num % 3 == 0) {
                p2 += 1;
            }
            if (num % 4 == 0) {
                p3 += 1;
            }
        }
        System.out.printf("%.2f%%\n" + "%.2f%%\n" + "%.2f%%", p1 / n * 100, p2 / n * 100, p3 / n * 100);
    }
}
