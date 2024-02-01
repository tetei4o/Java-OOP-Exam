import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Birthable> birthables = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            if (commands[0].equals("Robot")) {
                robots.add(new Robot(commands[1], commands[2]));
            } else if (commands[0].equals("Citizen")) {
                birthables.add(new Citizen(commands[1], Integer.parseInt(commands[2]), commands[3], commands[4]));
            } else {
                birthables.add(new Pet(commands[1], commands[2]));
            }
            input = scan.nextLine();
        }
        String yearToFind = scan.nextLine();
        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().endsWith(yearToFind)) {
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
