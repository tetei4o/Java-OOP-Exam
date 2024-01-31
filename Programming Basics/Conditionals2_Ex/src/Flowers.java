import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double price = 0;
        double discount = 0;
        double totalPrice;
        switch (type) {
            case "roses":
                price = 5;
                if (quantity > 80) {
                    discount = 10;
                }
                break;
            case "dahlias":
                price = 3.80;
                if (quantity > 90) {
                    discount = 15;
                }
                break;
            case "tulips":
                price = 2.80;
                if (quantity > 80) {
                    discount = 15;
                }
                break;
            case "narcissus":
                price = 3;
                if (quantity < 120) {
                    discount = -15;
                }
                break;
            case "gladiolus":
                price = 2.50;
                if (quantity < 80) {
                    discount = -20;
                }
                break;
        }
        totalPrice = (price * quantity) - (price * quantity * discount / 100);
        double difference;
        if (budget >= totalPrice) {
            difference = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, type, difference);
        } else {
            difference = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
