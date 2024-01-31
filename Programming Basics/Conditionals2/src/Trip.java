import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String grade = scan.nextLine();
        double stay = days - 1;
        double price = 0;
        double result = 0;
        switch (room.toLowerCase()) {
            case "room for one person":
                price = stay * 18;
                break;
            case "apartment":
                if (stay < 10) {
                    price = (stay * 25) - ((stay * 25) * 30 / 100);
                } else if (stay > 9 && stay <= 15) {
                    price = (stay * 25) - ((stay * 25) * 35 / 100);
                } else if (stay > 15) {
                    price = (stay * 25) - ((stay * 25) * 50 / 100);
                }
                break;
            case "president apartment":
                if (stay < 10) {
                    price = (stay * 35) - ((stay * 35) * 10 / 100);
                } else if (stay > 9 && stay <= 15) {
                    price = (stay * 35) - ((stay * 35) * 15 / 100);
                } else if (stay > 15) {
                    price = (stay * 35) - ((stay * 35) * 20 / 100);
                }
                break;
        }
        switch (grade.toLowerCase()) {
            case "positive":
                result = price + price * 25 / 100;
                break;
            case "negative":
                result = price - price * 10 / 100;
                break;
        }
        System.out.printf("%.2f", result);
    }
}
