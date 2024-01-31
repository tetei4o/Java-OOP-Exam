import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scan.nextLine());
        double ownedMoney = Double.parseDouble(scan.nextLine());
        int spendingDays = 0;
        int days = 0;
        while (ownedMoney < neededMoney && spendingDays < 5) {
            String input = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            days++;
            if (input.equals("save")) {
                ownedMoney += money;
                spendingDays = 0;
            } else if (input.equals("spend")) {
                ownedMoney -= money;
                spendingDays++;
                if (ownedMoney < money) {
                    ownedMoney = 0;
                }
            }
        }
        if (spendingDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (ownedMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
