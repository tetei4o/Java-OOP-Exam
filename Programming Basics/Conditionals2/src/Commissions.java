import java.util.Scanner;

public class Commissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double commissions = 0;
        boolean isValid = true;
        switch (city.toLowerCase()) {
            case "sofia":
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 7 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 8 / 100;
                } else if (sales > 10000) {
                    commissions = sales * 12 / 100;
                } else {
                    isValid = false;
                }
                break;
            case "varna":
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 4.5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 7.5 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 10 / 100;
                } else if (sales > 10000) {
                    commissions = sales * 13 / 100;
                } else {
                    isValid = false;
                }
                break;
            case "plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commissions = sales * 5.5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    commissions = sales * 8 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    commissions = sales * 12 / 100;
                } else if (sales > 10000) {
                    commissions = sales * 14.5 / 100;
                } else {
                    isValid = false;
                }
                break;
            default:
                isValid = false;
        }
        if (isValid) {
            System.out.printf("%.2f", commissions);
        } else {
            System.out.println("error");
        }
    }
}
