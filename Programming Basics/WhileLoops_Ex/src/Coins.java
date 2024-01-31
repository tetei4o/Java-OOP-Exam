import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = Double.parseDouble(scan.nextLine()); //kolko resto trqbva da se vurne
        sum *= 100;
        int coins = 0;
        while ((int) sum != 0) { //trqbva da vadim ot sumata restoto
            if ((int) sum >= 200) {
                sum -= 200;
                coins++;
            } else if ((int) sum < 200 && (int) sum >= 100) {
                sum -= 100;
                coins++;
            } else if ((int) sum < 100 && (int) sum >= 50) {
                sum -= 50;
                coins++;
            } else if ((int) sum < 50 && (int) sum >= 20) {
                sum -= 20;
                coins++;
            } else if ((int) sum < 20 && (int) sum >= 10) {
                sum -= 10;
                coins++;
            } else if ((int) sum < 10 && (int) sum >= 5) {
                sum -= 5;
                coins++;
            } else if ((int) sum < 5 && (int) sum >= 2) {
                sum -= 2;
                coins++;
            } else if ((int) sum == 1) {
                sum -= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
