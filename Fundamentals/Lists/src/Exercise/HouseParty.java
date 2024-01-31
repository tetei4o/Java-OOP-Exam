package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            boolean alreadyInList = guests.contains(input[0]);
            if (input[2].equals("going!")) {
                if (alreadyInList) {
                    System.out.println(input[0] + " is already in the list!");
                } else {
                    guests.add(input[0]);
                }
            }
            if (input[2].equals("not")) {
                if (alreadyInList) {
                    guests.remove(input[0]);
                } else {
                    System.out.println(input[0] + " is not in the list!");
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
