package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> passengersPerWagon = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    passengersPerWagon.add(Integer.parseInt(command[1]));
                    break;
                default:
                    for (int i = 0; i < passengersPerWagon.size(); i++) {
                        int sum = passengersPerWagon.get(i) + Integer.parseInt(command[0]);
                        if (sum <= maxCapacity) {
                            passengersPerWagon.set(i, sum);
                            break;
                        }
                    }
            }
            input = scan.nextLine();
        }
        System.out.println(passengersPerWagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
