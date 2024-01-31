import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hallPrice = Integer.parseInt(scan.nextLine());
        double cakePrice = hallPrice * 20 / 100;
        double drinkPrice = cakePrice - (cakePrice * 45 / 100);
        double animatorPrice = hallPrice / 3;
        double price = hallPrice + cakePrice + drinkPrice + animatorPrice;
        System.out.println(price);
    }
}
