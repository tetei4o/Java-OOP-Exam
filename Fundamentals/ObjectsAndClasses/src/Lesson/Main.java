package Lesson;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        LocalDate myBirthday = LocalDate.of(2003, 7, 14);
//        System.out.println(myBirthday);
//        Random randomNum = new Random();
//        int random = randomNum.nextInt(11);
//        System.out.println(random);
        Dice myDice = new Dice();
        myDice.setSides(6);
        System.out.println(myDice.roll());
    }
}
