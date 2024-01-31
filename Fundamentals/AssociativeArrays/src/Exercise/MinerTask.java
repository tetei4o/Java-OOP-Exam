package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Integer> minedResources = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scan.nextLine());
            if (!minedResources.containsKey(resource)) {
                minedResources.put(resource, quantity);
            } else {
                int temp = minedResources.get(resource);
                minedResources.replace(resource, temp + quantity);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : minedResources.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
