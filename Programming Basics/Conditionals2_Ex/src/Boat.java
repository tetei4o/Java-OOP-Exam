import java.util.Scanner;

public class Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFisherman = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (numFisherman <= 6) {
            price *= 0.90;
        } else if (numFisherman <= 11) {
            price *= 0.85;
        } else if (numFisherman >= 12) {
            price *= 0.75;
        }
        if (numFisherman % 2 == 0 && !season.equals("Autumn")) {
            price *= 0.95;
        }

        double leftMoney = groupBudget - price;
        double moneyNeeded = price - groupBudget;
        if (groupBudget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
        }
    }
}