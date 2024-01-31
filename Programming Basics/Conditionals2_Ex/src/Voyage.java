import java.util.Scanner;

public class Voyage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String type = "";
        String dest = "";
        double moneySpent = 0;
        switch (season) {
            case "summer":
                if (budget <= 100) {
                    dest = "Bulgaria";
                    type = "Camp";
                    moneySpent = budget * 30 / 100;
                } else if (budget > 100 && budget <= 1000) {
                    dest = "Balkans";
                    type = "Camp";
                    moneySpent = budget * 40 / 100;
                } else if (budget > 1000) {
                    dest = "Europe";
                    type = "Hotel";
                    moneySpent = budget * 90 / 100;
                }
                break;
            case "winter":
                if (budget <= 100) {
                    dest = "Bulgaria";
                    type = "Hotel";
                    moneySpent = budget * 70 / 100;
                } else if (budget > 100 && budget <= 1000) {
                    dest = "Balkans";
                    type = "Hotel";
                    moneySpent = budget * 80 / 100;
                } else if (budget > 1000) {
                    dest = "Europe";
                    type = "Hotel";
                    moneySpent = budget * 90 / 100;
                }
                break;
        }
        System.out.printf("Somewhere in %s", dest);
        System.out.println();
        System.out.printf("%s - %.2f", type, moneySpent);
    }
}
