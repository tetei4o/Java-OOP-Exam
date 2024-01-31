package Lesson;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        while (!command.equals("Home")) {
            if (command.equals("back")) {
                if (history.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            } else {
                history.push(command);
                System.out.println(command);
            }
            command = scan.nextLine();
        }
    }
}
