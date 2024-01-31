import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        int expectedPlunder = Integer.parseInt(scan.nextLine());
        double gainedPlunder = 0;
        for (int i = 1; i <= days; i++) {
            gainedPlunder = gainedPlunder + dailyPlunder;
            if (i % 3 == 0) {
                gainedPlunder = gainedPlunder + (double) dailyPlunder * 0.5;
            }
            if (i % 5 == 0) {
                gainedPlunder = gainedPlunder * 0.7;
            }
        }
        if (gainedPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gainedPlunder);
        } else {
            double percentage = gainedPlunder / expectedPlunder * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
