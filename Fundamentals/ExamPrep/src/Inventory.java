import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("Craft!")) {
            String[] command = input.split(" - ");
            switch (command[0]) {
                case "Collect":
                    if (!inventory.contains(command[1])) {
                        inventory.add(command[1]);
                    }
                    break;
                case "Drop":
                    inventory.remove(command[1]);
                    break;
                case "Combine Items":
                    String[] itemsToCombine = command[1].split(":");
                    if (inventory.contains(itemsToCombine[0])) {
                        inventory.add(inventory.indexOf(itemsToCombine[0]) + 1, itemsToCombine[1]);
                    }
                    break;
                case "Renew":
                    if (inventory.contains(command[1])) {
                        String objectToRenew = command[1];
                        inventory.remove(command[1]);
                        inventory.add(objectToRenew);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
