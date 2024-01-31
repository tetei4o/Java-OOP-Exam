import java.util.Scanner;

public class Room {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        int stay = Integer.parseInt(scan.nextLine());
        double aptPrice = 0;
        double studPrice = 0;
        switch (month) {
            case "October":
            case "May":
                if (stay > 7 && stay <= 14) {
                    studPrice = 50 * stay * 0.95;
                } else if (stay > 14) {
                    studPrice = 50 * stay * 0.70;
                } else {
                    studPrice = 50 * stay;
                }
                if (stay > 14) {
                    aptPrice = 65 * stay * 0.90;
                } else {
                    aptPrice = 65 * stay;
                }
                break;
            case "June":
            case "September":
                if (stay > 14) {
                    studPrice = 75.20 * stay * 0.80;
                } else {
                    studPrice = 75.20 * stay;
                }
                if (stay > 14) {
                    aptPrice = 68.70 * stay * 0.90;
                } else {
                    aptPrice = 68.70 * stay;
                }
                break;
            case "July":
            case "August":
                studPrice = 76 * stay;
                if (stay > 14) {
                    aptPrice = 77 * stay * 0.90;
                } else {
                    aptPrice = 77 * stay;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.", aptPrice);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", studPrice);
    }
}
