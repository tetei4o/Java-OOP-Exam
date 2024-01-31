package Lesson;

import java.util.Random;

public class Dice {
    private int sides;
    String color;
    int size;

    public void setSides(int number) {
        sides = number;
    }

    public int getSides() {
        return sides;
    }

    int roll() {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}
