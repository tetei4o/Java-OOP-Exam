package Exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();
        String input = scan.nextLine();
        while (!input.equals("search")) {
            phonebook.put(input.split("-")[0], input.split("-")[1]);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!input.equals("stop")) {
            if (!phonebook.containsKey(input)) {
                System.out.printf("Contact %s does not exist.\n", input);
            } else {
                System.out.printf("%s -> %s\n", input, phonebook.get(input));
            }
            input = scan.nextLine();
        }
    }
}
