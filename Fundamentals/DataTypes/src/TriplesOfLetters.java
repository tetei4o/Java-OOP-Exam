import java.util.Scanner;

public class TriplesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 97; i < 97 + n; i++) {
            for (int j = 97; j < 97 + n; j++) {
                for (int k = 97; k < 97 + n; k++) {
                    char one = (char) i;
                    char two = (char) j;
                    char three = (char) k;
                    System.out.printf("%c%c%c\n", one, two, three);
                }

            }

        }
    }
}
