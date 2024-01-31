import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();
        double pricePerPerson = 0;
        double totalPrice = 0;
        switch (type) {
            case "Students":
                switch (day) {
                    case "Friday":
                        pricePerPerson = 8.45;
                        break;
                    case "Saturday":
                        pricePerPerson = 9.80;
                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;
                        break;
                }
                totalPrice = num * pricePerPerson;
                if (num >= 30) {
                    totalPrice = totalPrice - totalPrice * 15 / 100;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        pricePerPerson = 10.90;
                        break;
                    case "Saturday":
                        pricePerPerson = 15.60;
                        break;
                    case "Sunday":
                        pricePerPerson = 16;
                        break;
                }
                totalPrice = num * pricePerPerson;
                if (num >= 100) {
                    totalPrice = (num - 10) * pricePerPerson;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        pricePerPerson = 15;
                        break;
                    case "Saturday":
                        pricePerPerson = 20;
                        break;
                    case "Sunday":
                        pricePerPerson = 22.50;
                        break;
                }
                totalPrice = num * pricePerPerson;
                if (num >= 10 && num <= 20) {
                    totalPrice = totalPrice - totalPrice * 5 / 100;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
