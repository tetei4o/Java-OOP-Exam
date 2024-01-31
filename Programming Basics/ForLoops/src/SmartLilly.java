import java.util.Scanner;

public class SmartLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double priceWasher = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());
        int moneyReceived = 0;
        int money = 0;
        int moneyFromToys = 0;
        int moneyFromBD = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                moneyFromToys += priceToy;
            } else {
                moneyReceived += 10;
                moneyFromBD = moneyFromBD + moneyReceived - 1;
            }
        }
        money = moneyFromBD + moneyFromToys;
        double diff = money - priceWasher;
        if (money >= priceWasher) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff * -1);
        }
    }
}
