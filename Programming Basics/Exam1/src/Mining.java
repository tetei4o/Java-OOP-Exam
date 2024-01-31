import java.util.Scanner;

public class Mining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cardPrice = Integer.parseInt(scan.nextLine());
        int jumperPrice = Integer.parseInt(scan.nextLine());
        double electricity = Double.parseDouble(scan.nextLine());
        double cardGain = Double.parseDouble(scan.nextLine());
        int totalPrice = cardPrice * 13 + jumperPrice * 13 + 1000;
        double totalGain = (cardGain - electricity) * 13;
        double days = totalPrice / totalGain;
        System.out.println(totalPrice);
        System.out.println((int) Math.ceil(days));
    }
}
