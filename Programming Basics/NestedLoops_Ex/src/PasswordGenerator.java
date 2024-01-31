import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        int symbolOne;
        int symbolTwo;
        char symbolThree;
        char symbolFour;
        int symbolFive;
        for (symbolOne = 1; symbolOne <= n; symbolOne++) {
            for (symbolTwo = 1; symbolTwo <= n; symbolTwo++) {
                for (symbolThree = 97; symbolThree < l + 97; symbolThree++) {
                    for (symbolFour = 97; symbolFour < l + 97; symbolFour++) {
                        for (symbolFive = 1; symbolFive <= n; symbolFive++) {
                            if (symbolFive > symbolOne && symbolFive > symbolTwo) {
                                System.out.printf("%d%d%c%c%d ", symbolOne, symbolTwo, symbolThree, symbolFour, symbolFive);
                            }
                        }
                    }
                }
            }
        }
    }
}
