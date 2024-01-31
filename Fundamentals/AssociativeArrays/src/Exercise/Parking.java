package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split(" ");
            if (commands[0].equals("register")) {
                if (!parking.containsKey(commands[1])) {
                    parking.put(commands[1], commands[2]);
                    System.out.println(commands[1] + " registered " + commands[2] + " successfully");
                } else {
                    System.out.println("ERROR: already registered with plate number " + commands[2]);
                }

            } else if (commands[0].equals("unregister")) {
                if (parking.containsKey(commands[1])) {
                    parking.remove(commands[1]);
                    System.out.println(commands[1] + " unregistered successfully");
                } else {
                    System.out.println("ERROR: user " + commands[1] + " not found");
                }
            }
        }
        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.printf("%s => %s\n", entry.getKey(), entry.getValue());
        }
    }
}
