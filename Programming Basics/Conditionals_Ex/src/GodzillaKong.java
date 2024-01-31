import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double clothes = Double.parseDouble(scan.nextLine());
        double decorPrice = budget * 10 / 100;
        double clothesPrice = clothes * statists;
        double discount = 0;
        double difference;
        if (statists > 150) {
            discount = clothesPrice * 10 / 100;
        }
        double cost = decorPrice + clothesPrice - discount;
        if (cost <= budget) {
            difference = budget - cost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            difference = cost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}
