package Exercise;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder encryptedMessage = new StringBuilder();
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char newChar = (char) (input.charAt(i) + 3);
            encryptedMessage.append(newChar);
        }
        System.out.println(encryptedMessage);
    }
}
