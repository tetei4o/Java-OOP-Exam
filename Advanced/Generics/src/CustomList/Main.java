package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CustomList<String> customList = new CustomList<String>();
        String command = scan.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String commandName = tokens[0];
            switch (commandName) {
                case "Add":
                    customList.add(tokens[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(tokens[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    for (String el : customList.getElements()) {
                        System.out.println(el);
                    }
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
            }
            command = scan.nextLine();
        }
    }
}
