package Lesson;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<Integer> firstDeck = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondDeck = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while (rounds-- > 0) {
            int firstCard = getCard(firstDeck);
            int secondCard = getCard(secondDeck);
            firstDeck.remove(firstCard);
            secondDeck.remove(secondCard);
            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(secondCard);
                secondDeck.add(firstCard);
            }
            if (firstDeck.isEmpty() || secondDeck.isEmpty()) {
                break;
            }
        }
        if (firstDeck.size() < secondDeck.size()) {
            System.out.println("Second player win!");
        } else if (secondDeck.size() < firstDeck.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static int getCard(LinkedHashSet<Integer> set) {
        for (Integer card : set) {
            return card;
        }
        return 0;
    }
}
