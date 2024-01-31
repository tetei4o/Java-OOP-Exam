import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.equals("End")) {
            return;
        }
        double moneyToAdd;
        double neededMoney = Double.parseDouble(scan.nextLine());
        while (input != "End") {
            while (neededMoney > 0) {
                moneyToAdd = Double.parseDouble(scan.nextLine());
                neededMoney -= moneyToAdd;
            }
            System.out.println("Going to " + input + "!");
            input = scan.nextLine();
            if (input.equals("End")) {
                return;
            } else {
                neededMoney = Double.parseDouble(scan.nextLine());
            }
        }
    }
}
