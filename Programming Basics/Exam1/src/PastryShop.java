import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int day = Integer.parseInt(scan.nextLine());
        double price = 0;
        switch (type) {
            case "Cake":
                if (day <= 15) {
                    price = 24 * quantity;
                } else {
                    price = 28.70 * quantity;
                }
                break;
            case "Souffle":
                if (day <= 15) {
                    price = 6.66 * quantity;
                } else {
                    price = 9.80 * quantity;
                }
                break;
            case "Baklava":
                if (day <= 15) {
                    price = 12.60 * quantity;
                } else {
                    price = 16.98 * quantity;
                }
                break;
        }
        if (day <= 22) {
            if (price > 99 && price < 201) {
                price *= 0.85;
            } else if (price > 200) {
                price *= 0.75;
            }
        }
        if (day <= 15) {
            price *= 0.90;
        }
        System.out.printf("%.2f", price);
    }
}
