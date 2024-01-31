import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> dungeonRooms = Arrays.stream(scan.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int health = 100;
        int bitcoinCount = 0;
        int rooms = 0;
        for (String dungeonRoom : dungeonRooms) {
            String[] event = dungeonRoom.split(" ");
            switch (event[0]) {
                case "potion":
                    if (health + Integer.parseInt(event[1]) > 100) {
                        int healthToAdd = 100 - health;
                        health += healthToAdd;
                        System.out.println("You healed for " + healthToAdd + " hp.");
                    } else {
                        health += Integer.parseInt(event[1]);
                        System.out.println("You healed for " + Integer.parseInt(event[1]) + " hp.");
                    }
                    System.out.println("Current health: " + health + " hp.");
                    rooms++;
                    break;
                case "chest":
                    bitcoinCount += Integer.parseInt(event[1]);
                    System.out.println("You found " + Integer.parseInt(event[1]) + " bitcoins.");
                    rooms++;
                    break;
                default:
                    health -= Integer.parseInt(event[1]);
                    if (health <= 0) {
                        rooms++;
                        System.out.println("You died! Killed by " + event[0] + ".");
                        System.out.println("Best room: " + rooms);
                        return;
                    } else {
                        System.out.println("You slayed " + event[0] + ".");
                        rooms++;
                    }
            }
        }
        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + bitcoinCount);
        System.out.println("Health: " + health);
    }
}
