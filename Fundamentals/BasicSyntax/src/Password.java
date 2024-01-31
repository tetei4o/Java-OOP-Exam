import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String pass = scan.nextLine();
        int tries = 0;
        int correctChars = 0;
        while (correctChars < name.length() && tries <= 3) {
            if (name.length() == pass.length()) {
                for (int i = name.length(); i >= 1; i--) {
                    if (pass.charAt(i - 1) == name.charAt(pass.length() - i)) {
                        correctChars++;
                    } else {
                        tries++;
                        correctChars = 0;
                        if (tries <= 3) {
                            System.out.println("Incorrect password. Try again.");
                            pass = scan.nextLine();
                        }
                        break;
                    }
                }
            } else {
                tries++;
                System.out.println("Incorrect password. Try again.");
                pass = scan.nextLine();
            }

        }
        if (correctChars == name.length()) {
            System.out.printf("User %s logged in.", name);
        } else {
            System.out.printf("User %s blocked!", name);
        }
    }
}