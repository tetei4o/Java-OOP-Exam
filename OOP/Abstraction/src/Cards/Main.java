package Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.equals("Card Suits")) {
            System.out.println("Card Suits:");
            Suits[] values = Suits.values();
            for (Suits value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s\n", value.ordinal(), value.name());
            }
        } else if (input.equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            Ranks[] values = Ranks.values();
            for (Ranks value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s\n", value.ordinal(), value.name());
            }
        } else {
            String suit = scan.nextLine();
            System.out.printf("Card name: %s of %s; Card power: %d", input, suit, Suits.valueOf(suit).getMultiplier() + Ranks.valueOf(input).getPower());
        }
    }
}
