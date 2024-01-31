import java.util.Scanner;

public class Problem2Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String friendsOneLine = scan.nextLine();
        String[] friends = friendsOneLine.split(", ");
        String input = scan.nextLine();
        int blacklistedCount = 0;
        int lostCount = 0;
        while (!input.equals("Report")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Blacklist":
                    boolean isFound = false;
                    for (int i = 0; i < friends.length; i++) {
                        if (friends[i].equals(command[1])) {
                            System.out.println(command[1] + " was blacklisted.");
                            blacklistedCount++;
                            friends[i] = "Blacklisted";
                            isFound = true;
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println(command[1] + " was not found.");
                    }
                    break;
                case "Error":
                    if (!friends[Integer.parseInt(command[1])].equals("Blacklisted") && !friends[Integer.parseInt(command[1])].equals("Lost")) {
                        System.out.println(friends[Integer.parseInt(command[1])] + " was lost due to an error.");
                        friends[Integer.parseInt(command[1])] = "Lost";
                        lostCount++;
                    }
                    break;
                case "Change":
                    if (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < friends.length) {
                        System.out.println(friends[Integer.parseInt(command[1])] + " changed his username to " + command[2] + ".");
                        friends[Integer.parseInt(command[1])] = command[2];
                    }
            }
            input = scan.nextLine();
        }
        System.out.println("Blacklisted names: " + blacklistedCount);
        System.out.println("Lost names: " + lostCount);
        for (String friend : friends) {
            System.out.print(friend + " ");
        }
    }
}
