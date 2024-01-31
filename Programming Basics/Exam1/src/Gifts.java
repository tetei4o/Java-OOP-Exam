import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());
        for (int i = m; i >= n; i--) {
            if (i % 2 == 0 && i % 3 == 0 && i != s) {
                System.out.printf("%d ", i);
            } else if (i % 2 == 0 && i % 3 == 0 && i == s) {
                if (s % 2 == 0 && s % 3 == 0) {
                    break;
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
