import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int num;
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(scan.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
