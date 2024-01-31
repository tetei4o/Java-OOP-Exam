package Exercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] robots = scan.nextLine().split(";");
        LinkedHashMap<String, Integer> robotsAndTime = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> robotTimeWorked = new LinkedHashMap<>();
        fillLinkedHashMaps(robots, robotsAndTime, robotTimeWorked);
        int startTime = getStartTime(scan);
        String input = scan.nextLine();
        ArrayDeque<String> products = new ArrayDeque<>();
        while (!input.equals("End")) {
            products.offer(input);
            input = scan.nextLine();
        }
        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            startTime++;
            decreaseWorkingTime(robotTimeWorked);
            boolean isProductTaken = false;
            for (Map.Entry<String, Integer> robot : robotTimeWorked.entrySet()) {
                if (robot.getValue() == 0) {
                    String currentTime = getCurrentTime(startTime);
                    System.out.printf("%s - %s [%s]\n", robot.getKey(), currentProduct, currentTime);
                    robotTimeWorked.put(robot.getKey(), robotsAndTime.get(robot.getKey()));
                    isProductTaken = true;
                    break;
                }
            }
            if (!isProductTaken) {
                products.offer(currentProduct);
            }
        }
    }

    private static void decreaseWorkingTime(LinkedHashMap<String, Integer> robotTimeWorked) {
        for (Map.Entry<String, Integer> entry : robotTimeWorked.entrySet()) {
            if (entry.getValue() > 0) {
                robotTimeWorked.put(entry.getKey(), entry.getValue() - 1);
            }
        }
    }

    private static String getCurrentTime(int startTime) {
        int seconds = startTime % 60;
        int minutes = startTime % 3600 / 60;
        int hours = (startTime / 3600) % 24;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private static void fillLinkedHashMaps(String[] robots, LinkedHashMap<String, Integer> robotsAndTime, LinkedHashMap<String, Integer> robotTimeWorked) {
        for (String robot : robots) {
            String name = robot.split("-")[0];
            int time = Integer.parseInt(robot.split("-")[1]);
            robotsAndTime.put(name, time);
            robotTimeWorked.put(name, 0);
        }
    }

    private static int getStartTime(Scanner scan) {
        String[] timeArray = scan.nextLine().split(":");
        return Integer.parseInt(timeArray[0]) * 3600 + Integer.parseInt(timeArray[1]) * 60 + Integer.parseInt(timeArray[2]);
    }
}
