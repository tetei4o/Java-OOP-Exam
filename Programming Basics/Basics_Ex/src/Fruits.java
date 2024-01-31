import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double bananas = Double.parseDouble(scan.nextLine());
        double oranges = Double.parseDouble(scan.nextLine());
        double raspberries = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());
        double raspberryPrice = strawberryPrice / 2;
        double orangePrice = raspberryPrice - (raspberryPrice * 40 / 100);
        double bananaPrice = raspberryPrice - (raspberryPrice * 80 / 100);
        double sum = bananas * bananaPrice + oranges * orangePrice + raspberries * raspberryPrice + strawberries * strawberryPrice;
        System.out.printf("%.2f", sum);

    }
}
