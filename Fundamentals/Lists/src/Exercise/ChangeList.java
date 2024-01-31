package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> List = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            if (command[0].equals("Delete")) {
                List.removeIf(e -> e == Integer.parseInt(command[1]));
            } else if (command[0].equals("Insert")) {
                List.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }
            input = scan.nextLine();
        }
        System.out.println(List.toString().replaceAll("[\\[\\],]", ""));
    }
}
