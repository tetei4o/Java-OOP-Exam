package Lesson;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashSet<String> parking = new LinkedHashSet<>();
        String input = scan.nextLine();
        while (!input.equals("END")) {
            String command = input.split(", ")[0];
            String car = input.split(", ")[1];
            if (command.equals("IN")) {
                parking.add(car);
            } else {
                parking.remove(car);
            }
            input = scan.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), parking));
        }
    }
}
