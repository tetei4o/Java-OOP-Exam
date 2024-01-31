package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    intList.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) > intList.size() - 1 || Integer.parseInt(command[2]) < 0) {
                        System.out.println("Invalid index");
                    } else {
                        intList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(command[1]) > intList.size() - 1 || Integer.parseInt(command[1]) < 0) {
                        System.out.println("Invalid index");
                    } else {
                        intList.remove(Integer.parseInt(command[1]));
                    }
                    break;
                case "Shift":
                    if (command[1].equals("right")) {
                        shiftRight(intList, Integer.parseInt(command[2]));
                    } else if (command[1].equals("left")) {
                        shiftLeft(intList, Integer.parseInt(command[2]));
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(intList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> shiftLeft(List<Integer> intList, int iterations) {
        for (int i = 0; i < iterations; i++) {
            int temp = intList.get(0);
            for (int j = 0; j < intList.size() - 1; j++) {
                intList.set(j, intList.get(j + 1));
            }
            intList.set(intList.size() - 1, temp);
        }
        return intList;
    }

    private static List<Integer> shiftRight(List<Integer> intList, int iterations) {
        for (int i = 0; i < iterations; i++) {
            int temp = intList.get(intList.size() - 1);
            for (int j = intList.size() - 1; j > 0; j--) {
                intList.set(j, intList.get(j - 1));
            }
            intList.set(0, temp);
        }
        return intList;
    }
}
