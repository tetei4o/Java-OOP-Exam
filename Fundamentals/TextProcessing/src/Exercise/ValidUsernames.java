package Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] usernames = scan.nextLine().split(", ");
        for (String username : usernames) {
            if (username.length() >= 3 && username.length() <= 16 && isValid(username, username.length())) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValid(String username, int length) {
        boolean isValid = false;
        for (int i = 0; i < length; i++) {
            char currentChar = username.toLowerCase().charAt(i);
            if ((currentChar >= 97 && currentChar <= 122) || (currentChar >= 48 && currentChar <= 57) || currentChar == 95 || currentChar == 45) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
