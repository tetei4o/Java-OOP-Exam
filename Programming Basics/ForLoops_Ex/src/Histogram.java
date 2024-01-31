import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < 200) {
                p1 += 1;
            } else if (num >= 200 && num <= 399) {
                p2 += 1;
            } else if (num >= 400 && num <= 599) {
                p3 += 1;
            } else if (num >= 600 && num <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        System.out.printf("%.2f%%\n" + "%.2f%%\n" + "%.2f%%\n" + "%.2f%%\n" + "%.2f%%", p1 / n * 100, p2 / n * 100, p3 / n * 100, p4 / n * 100, p5 / n * 100);
    }
}
