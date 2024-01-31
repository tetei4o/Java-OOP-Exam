import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        int price = 0;
        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
                price = 12;
                break;
            case "wednesday":
                price = 14;
                break;
            case "thursday":
                price = 14;
                break;
            case "friday":
                price = 12;
                break;
            case "saturday":
                price = 16;
                break;
            case "sunday":
                price = 16;
                break;
        }
        System.out.println(price);
    }
}
