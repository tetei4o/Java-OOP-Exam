import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int workers = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());
        double sum = (45 * cakes + 5.8 * waffles + 3.2 *pancakes) * workers * days;
        double finSum = sum - (sum * 1 / 8);
        System.out.printf("%.2f",finSum);
    }
}
