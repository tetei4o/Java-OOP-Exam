import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int boughtFood = Integer.parseInt(scan.nextLine());
        boughtFood *= 1000;
        int eatenFood = 0;
        String input = scan.nextLine();
        while (!input.equals("Adopted")) {
            int eaten = Integer.parseInt(input);
            eatenFood += eaten;
            input = scan.nextLine();
        }
        if (eatenFood <= boughtFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", boughtFood - eatenFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eatenFood - boughtFood);
        }
    }
}
