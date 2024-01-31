import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> chestContents = Arrays
                .stream(input.split("\\|"))
                .collect(Collectors.toList());
        input = scan.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        if (!chestContents.contains(command[i])) {
                            chestContents.add(0, command[i]);
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(command[1]) > chestContents.size() - 1 || Integer.parseInt(command[1]) < 0) {
                        break;
                    } else {
                        String itemToRemove = chestContents.get(Integer.parseInt(command[1]));
                        chestContents.remove(Integer.parseInt(command[1]));
                        chestContents.add(itemToRemove);
                    }
                    break;
                case "Steal":
                    List<String> stolenItems = new ArrayList<>();
                    int stealAmount = Integer.parseInt(command[1]);
                    if (stealAmount >= chestContents.size()) {
                        System.out.println(String.join(", ", chestContents));
                        chestContents.clear();
                        break;
                    } else {
                        Collections.reverse(chestContents);
                        for (int i = stealAmount - 1; i >= 0; i--) {
                            stolenItems.add(chestContents.get(i));
                            chestContents.remove(i);
                        }
                        Collections.reverse(chestContents);
                        System.out.println(String.join(", ", stolenItems));
                    }
                    break;
            }
            input = scan.nextLine();
        }
        if (chestContents.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double pirateCredits = 0;
            for (String chestContent : chestContents) {
                pirateCredits = pirateCredits + chestContent.length();
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", pirateCredits / chestContents.size());
        }
    }
}
