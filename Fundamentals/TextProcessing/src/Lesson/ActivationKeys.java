package Lesson;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder key = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("Generate")) {
            String[] commands = input.split(">>>");
            switch (commands[0]) {
                case "Contains":
                    if (key.indexOf(commands[1]) != -1) {
                        System.out.printf("%s contains %s\n", key, commands[1]);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(commands[2]);
                    int endIndex = Integer.parseInt(commands[3]);
                    if (commands[1].equals("Upper")) {
                        for (int i = startIndex; i < endIndex; i++) {
                            char currentChar = key.charAt(i);
                            key.setCharAt(i, Character.toUpperCase(currentChar));
                        }
                        System.out.println(key);
                    } else if (commands[1].equals("Lower")) {
                        for (int i = startIndex; i < endIndex; i++) {
                            char currentChar = key.charAt(i);
                            key.setCharAt(i, Character.toLowerCase(currentChar));
                        }
                        System.out.println(key);
                    }
                    break;
                case "Slice":
                    int sliceBeginIndex = Integer.parseInt(commands[1]);
                    int sliceEndIndex = Integer.parseInt(commands[1]);
                    key.delete(sliceBeginIndex, sliceEndIndex);
                    System.out.println(key);
                    break;
            }
            input = scan.nextLine();
        }
        System.out.printf("Your activation key is: %s", key);
    }
}
