import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double bearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;
        double discount;
        double excursion = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());
        double sum = puzzlePrice * puzzles + dollPrice * dolls + bearPrice * bears + minionPrice * minions + truckPrice * trucks;
        if ((puzzles + dolls + bears + minions + trucks) >= 50) {
            discount = sum * 25 / 100;
        } else {
            discount = 0;
        }
        double sum2 = sum - discount;
        double finSum = sum2 - (sum2 * 10 / 100);
        double difference;
        if (finSum >= excursion) {
            difference = finSum - excursion;
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            difference = excursion - finSum;
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
